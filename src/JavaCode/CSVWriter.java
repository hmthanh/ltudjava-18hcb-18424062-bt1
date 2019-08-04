/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCode;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 * @author sieus
 */
public class CSVWriter<T> {

    public static final String COMMA_DELIMITER = ",";

    public Boolean writeCSV(String fileName, List<T> data, T type) {
        String strAbsolutePath = Utils.getRootUrl() + fileName;
        try (BufferedWriter br = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(strAbsolutePath), "UTF-8"))) {
            for (int i = 0; i < data.size(); i++) {
                String line = data.get(i).toString();
                br.write(line);
                if (i < data.size() - 1) {
                    br.newLine();
                }
            }
        } catch (IOException e) {
            return false;
        }

        return true;
    }
    public Boolean writeToFile(File file, List<T> data){
        try (PrintWriter writer = new PrintWriter(file)) {
            for (int i = 0; i < data.size(); i++) {
                String line = data.get(i).toString();
                writer.write(line);
                if (i < data.size() - 1) {
                    writer.write("\n");
                }
            }
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    public Boolean update(String outputFile, String inputFile, T item) {
        CSVReader reader = new CSVReader();
        List<T> data = reader.readCSV(inputFile, item);

        return update(outputFile, data, item);
    }

    public Boolean update(String outputFile, List<T> data, T item) {
        Integer idx = data.indexOf(item);
        if (idx != -1) {
            data.set(idx, item);
        }

        return writeCSV(outputFile, data, item);
    }
    
    public Boolean addItem(String filePath, T item){
        CSVReader reader = new CSVReader();
        List<T> data = reader.readCSV(filePath, item);
        data.add(item);
        
        return this.writeCSV(filePath, data, item);
    }
}
