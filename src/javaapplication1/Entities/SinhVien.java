/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.Entities;

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
 * @author Asus
 */
public class SinhVien {
    
    String mSSV;
    String hoTen;
    String gioiTinh;
    String cMND;

    public SinhVien(String mSSV, String hoTen, String gioiTinh, String cMND) {
      
        this.mSSV = mSSV;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.cMND = cMND;
    }

    public SinhVien() {
    }

    public String getmSSV() {
        return mSSV;
    }

    public void setmSSV(String mSSV) {
        this.mSSV = mSSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getcMND() {
        return cMND;
    }

    public void setcMND(String cMND) {
        this.cMND = cMND;
    }
    
     public  SinhVien ThemSinhVien(String[] metadata) {
        
         mSSV = metadata[0];
         hoTen = metadata[1];
         gioiTinh = metadata[2];
         cMND =  metadata[3];

        // create and return book of this metadata
        return new SinhVien(mSSV, hoTen, gioiTinh,cMND);
    }
    
     
     public List<SinhVien> getAllSinhVien(String lophoc)
     {
         File file = new File("");
        String currentDirectory = file.getAbsolutePath();
          List<SinhVien> listSinhVien = new ArrayList<SinhVien>();
        currentDirectory +="\\Data\\DuLieu\\DanhSachSinhVien\\" + lophoc+".txt";
        Path pathToFile = Paths.get(currentDirectory);
        String lopHoc ="";
        try (BufferedReader br = Files.newBufferedReader(pathToFile, StandardCharsets.UTF_8)) 
        {

            // read the first line from the text file
            String line = br.readLine();                                         
            while (line != null) 
            {
               
               String[] attributes = line.split("\\|");
                SinhVien sv = new SinhVien();
                 sv = sv.ThemSinhVien(attributes);
                // adding book into ArrayList
                listSinhVien.add(sv);

                // read next line before looping
                // if end of file reached, line would be null
                line = br.readLine();
            }
            
            
            // loop until all lines are read
            

        } catch (IOException ioe) 
        {
            System.out.println("javaapplication1.formDanhSachSinhVien.formWindowOpened()");
            ioe.printStackTrace();
          
        }
         
     
     return  listSinhVien;
     }
             
    
    
}
