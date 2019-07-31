/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author sieus
 */
public class Student {

    private String _stdID;
    private String _fullName;
    private String _gender;
    private String _IDCard;

    public Student(String stdID, String fullName, String gender, String IDCard) {
        this._stdID = stdID;
        this._fullName = fullName;
        this._gender = gender;
        this._IDCard = IDCard;
    }

    public Student() {
        this._stdID = "";
        this._fullName = "";
        this._gender = "";
        this._IDCard = "";
    }

    public String getStdID() {
        return this._stdID;
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    public static Student readFromMetaData(List<String> metaData) {
        String stdID = metaData.get(0);
        String fullName = metaData.get(1);
        String gender = metaData.get(2);
        String IDCard = metaData.get(3);

        // create and return book of this metadata
        return new Student(stdID, fullName, gender, IDCard);
    }

    public List<Student> getAll(String fileName) {
        List<Student> result = new ArrayList<Student>();
//        File file = new File("");
//        String currentDirectory = file.getAbsolutePath();
//        currentDirectory += "\\Data\\DuLieu\\DanhSachSinhVien\\" + lophoc + ".txt";
//        Path pathToFile = Paths.get(currentDirectory);
//        String lopHoc = "";
//        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) {
//
//            // read the first line from the text file
//            String line = br.readLine();
//            while (line != null) {
//
//                String[] attributes = line.split("\\|");
//                SinhVien sv = new SinhVien();
//                sv = sv.ThemSinhVien(attributes);
//                // adding book into ArrayList
//                listSinhVien.add(sv);
//
//                // read next line before looping
//                // if end of file reached, line would be null
//                line = br.readLine();
//            }
//
//            // loop until all lines are read
//        } catch (IOException ioe) {
//            System.out.println("javaapplication1.formDanhSachSinhVien.formWindowOpened()");
//            ioe.printStackTrace();
//
//        }

        return result;
    }
}
