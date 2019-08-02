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
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sieus
 */
public class CSVReader<T> {
    public static final String COMMA_DELIMITER = ",";
    public List<T> readCSV(String fileName, T type){
        List<List<String>> records = new ArrayList<List<String>>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                
                String[] values = line.split(COMMA_DELIMITER);
                records.add(Arrays.asList(values));
            }
        }
        catch (IOException e){
            e.printStackTrace();    
        }
        
        List<T> result = new ArrayList<T>();
        for (int i = 0; i < records.size(); i++) {
            List<String> metaData = records.get(i);
            Object item = null;
            if (type instanceof Student){
                item = Student.readFromMetaData(metaData);
            }
            if (type instanceof Account){
                item = Account.readFromMetaData(metaData);
            }
            if (type instanceof Score){
                item = Score.readFromMetaData(metaData);
            }
            if (type instanceof Subject){
                item = Subject.readFromMetaData(metaData);
            }
            result.add((T) item);
        }
        
        return result;
    }
    
    
    
}
