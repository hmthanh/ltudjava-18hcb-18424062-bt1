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
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author sieus
 */
public class CSVWriter<T> {
    public static final String COMMA_DELIMITER = ",";
    public Boolean writeCSV(String fileName, T type, List<T> data){
        String rootUrl = Utils.getRootUrl();
        String strAbsolutePath = rootUrl + fileName;
        try (BufferedWriter br = new BufferedWriter(new FileWriter(strAbsolutePath))) {
            for (int i = 0; i < data.size(); i++) {
                String line = data.get(i).toString();
                br.write(line);
            }
        }
        catch (IOException e){
            return false;
        }
        
        return true;
    }
    
    
    
}
