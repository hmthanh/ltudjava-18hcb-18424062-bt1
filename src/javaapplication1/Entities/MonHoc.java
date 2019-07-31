/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.Entities;

/**
 *
 * @author Asus
 */
public class MonHoc {
    String maMonHoc;
    String tenMonHoc;
    String phongHoc;

    public MonHoc(String maMonHoc, String tenMonHoc, String phongHoc) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.phongHoc = phongHoc;
    }

    public MonHoc() {
    }
    
    

    public String getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(String maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getPhongHoc() {
        return phongHoc;
    }

    public void setPhongHoc(String phongHoc) {
        this.phongHoc = phongHoc;
    }
    
    
     public  MonHoc ThemMonHoc(String[] metadata) {
        
         maMonHoc = metadata[0];
         tenMonHoc = metadata[1];
         phongHoc = metadata[2];
         

        // create and return book of this metadata
        return new MonHoc(maMonHoc, tenMonHoc, phongHoc);
    }
    
    
}
