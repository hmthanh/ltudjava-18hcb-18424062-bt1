/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCode;

import Entities.Score;
import Entities.Student;
import Entities.Subject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sieus
 */
public class Utils {

    public Utils() {

    }
    public static final String COMMA_DELIMITER = ",";

    public static String getRootUrl() {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();

        return path.toString();
    }

    public static String getAbsolutePath(String key) {
        String path = Utils.getRootUrl();

        return path + "/Data/" + key + "/";
    }

    public static List<String> listFilesForFolder(String dir) {
        List<String> list = new ArrayList();
        File folder = new File(dir);
        for (final File fileEntry : folder.listFiles()) {
            if (!fileEntry.isDirectory()) {
                list.add(fileEntry.getName());
            }
        }

        return list;
    }

    public static Boolean importClass(String filename) {
        List<List<String>> records = new ArrayList<List<String>>();
        String classN = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            classN = br.readLine().replace(",", "");//.replaceAll("[^\\x00-\\x7F]", "");
            String header = br.readLine();
            records = CSVReader.readToBuffer(br);
        } catch (IOException e) {
            return false;
        }
        List<Student> data = new ArrayList<Student>();
        for (int i = 0; i < records.size(); i++) {
            List<String> metaData = records.get(i);
            data.add(Student.readFromMetaData(metaData));
        }

        String rootUrl = Utils.getAbsolutePath(Student.getString());
        List<String> fileName = Utils.listAllCSVFile(Student.getString());
        int idx = fileName.indexOf(classN);
        if (idx != -1) {
            String existPath = "/Data/" + Student.getString() + "/" + fileName.get(idx) + ".csv";
            CSVReader<Student> reader = new CSVReader();
            List<Student> existStudent = reader.readCSV(existPath, new Student());
            for (int i = 0; i < existStudent.size(); i++) {
                data.add(existStudent.get(i));
            }
        }

        String fileOutput = rootUrl + classN + ".csv";
        CSVWriter<Student> writer = new CSVWriter<>();

        File file = new File(fileOutput);
        Boolean isS = writer.writeToFile(file, data);
        return isS;
    }

    public static Boolean importTimetable(String filename) {
        List<List<String>> records = new ArrayList<List<String>>();
        String classN = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            classN = br.readLine().replace(",", "");//.replaceAll( "[^\\x00-\\x7F]", "" );
            String header = br.readLine();
            records = CSVReader.readToBuffer(br);
        } catch (IOException e) {
            return false;
        }
        List<Subject> data = new ArrayList<Subject>();
        for (int i = 0; i < records.size(); i++) {
            List<String> metaData = records.get(i);
            data.add(Subject.readFromMetaData(metaData));
        }

        String rootUrl = Utils.getAbsolutePath(Subject.getString());
        List<String> fileName = Utils.listAllCSVFile(Subject.getString());
        int idx = fileName.indexOf(classN);
        if (idx != -1) {
            String existPath = "/Data/" + Subject.getString() + "/" + fileName.get(idx) + ".csv";
            CSVReader<Subject> reader = new CSVReader();
            List<Subject> existSubject = reader.readCSV(existPath, new Subject());
            for (int i = 0; i < existSubject.size(); i++) {
                data.add(existSubject.get(i));
            }
        }

        String fileOutput = rootUrl + classN + ".csv";
        CSVWriter<Subject> writer = new CSVWriter<>();

        File file = new File(fileOutput);
        Boolean isS = writer.writeToFile(file, data);
        return isS;
    }

    public static Boolean importScore(String filename) {
        List<List<String>> records = new ArrayList<List<String>>();
        String classN = "";
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            classN = br.readLine().replace(",", "");//.replaceAll( "[^\\x00-\\x7F]", "" );
            String header = br.readLine();
            records = CSVReader.readToBuffer(br);
        } catch (IOException e) {
            return false;
        }
        List<Score> data = new ArrayList<Score>();
        for (int i = 0; i < records.size(); i++) {
            List<String> metaData = records.get(i);
            data.add(Score.readFromMetaData(metaData));
        }

        String rootUrl = Utils.getAbsolutePath(Score.getString());
        List<String> fileName = Utils.listAllCSVFile(Score.getString());
        int idx = fileName.indexOf(classN);
        if (idx != -1) {
            String existPath = "/Data/" + Score.getString() + "/" + fileName.get(idx) + ".csv";
            CSVReader<Score> reader = new CSVReader();
            List<Score> existScore = reader.readCSV(existPath, new Score());
            for (int i = 0; i < existScore.size(); i++) {
                data.add(existScore.get(i));
            }
        }

        String fileOutput = rootUrl + classN + ".csv";
        CSVWriter<Score> writer = new CSVWriter<>();

        File file = new File(fileOutput);
        Boolean isS = writer.writeToFile(file, data);
        return isS;
    }

    public static List<String> listAllCSVFile(String key) {
        String dir = Utils.getAbsolutePath(key);
        final File folder = new File(dir);
        final String pattern = ".*\\.csv";
        List<String> result = new ArrayList<String>();
        for (final File f : folder.listFiles()) {
            if (f.getName().matches(pattern)) {
                result.add(f.getName().replace(".csv", ""));//.replaceAll( "[^\\x00-\\x7F]", "" ));
            }
        }

        return result;
    }
}
