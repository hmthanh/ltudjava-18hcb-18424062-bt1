/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCode;

import Entities.Account;
import Entities.Score;
import Entities.Student;
import Entities.Subject;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author sieus
 * @param <T>
 */
public class CSVReader<T> {

    public static final String COMMA_DELIMITER = ",";

    public List<T> readCSV(String fileName, T type) {
        String rootUrl = Utils.getRootUrl();
        List<List<String>> records = new ArrayList<List<String>>();
        String strAbsolutePath = rootUrl + fileName;
        File file = new File(strAbsolutePath);
        if (!file.isFile()) {
            JOptionPane.showMessageDialog(null, "Thất bại", "Tệp không tồn tại !", JOptionPane.INFORMATION_MESSAGE);
            return null;
        }
        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(strAbsolutePath), "UTF-8"))) {
            records = CSVReader.readToBuffer(br);
        } catch (IOException e) {
            
        }
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < records.size(); i++) {
            List<String> metaData = records.get(i);
            Object item = null;
            if (type instanceof Student) {
                item = Student.readFromMetaData(metaData);
            }
            if (type instanceof Account) {
                item = Account.readFromMetaData(metaData);
            }
            if (type instanceof Score) {
                item = Score.readFromMetaData(metaData);
            }
            if (type instanceof Subject) {
                item = Subject.readFromMetaData(metaData);
            }
            result.add((T) item);
        }

        return result;
    }

    public static List<List<String>> readToBuffer(BufferedReader buffReader) throws IOException {
        List<List<String>> records = new ArrayList<List<String>>();
        String line;
        while ((line = buffReader.readLine()) != null) {

            String[] values = line.split(COMMA_DELIMITER);
            records.add(Arrays.asList(values));
        }

        return records;
    }

}
