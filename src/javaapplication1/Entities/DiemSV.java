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
public class DiemSV {
    String MSSV;
    String HoTen;
    String DiemGK;
    String DiemCK;
    String DiemKhac;
    String DiemT;

    public DiemSV() {
    }

    public DiemSV(String MSSV, String HoTen, String DiemGK, String DiemCK, String DiemKhac, String DiemT) {
        this.MSSV = MSSV;
        this.HoTen = HoTen;
        this.DiemGK = DiemGK;
        this.DiemCK = DiemCK;
        this.DiemKhac = DiemKhac;
        this.DiemT = DiemT;
    }

    
    
    
    
    public String getMSSV() {
        return MSSV;
    }

    public void setMSSV(String MSSV) {
        this.MSSV = MSSV;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getDiemGK() {
        return DiemGK;
    }

    public void setDiemGK(String DiemGK) {
        this.DiemGK = DiemGK;
    }

    public String getDiemCK() {
        return DiemCK;
    }

    public void setDiemCK(String DiemCK) {
        this.DiemCK = DiemCK;
    }

    public String getDiemKhac() {
        return DiemKhac;
    }

    public void setDiemKhac(String DiemKhac) {
        this.DiemKhac = DiemKhac;
    }

    public String getDiemT() {
        return DiemT;
    }

    public void setDiemT(String DiemT) {
        this.DiemT = DiemT;
    }
    
    public DiemSV ThemDiemSV(String[] metadata) {
        
         MSSV = metadata[0];
         HoTen = metadata[1];
         DiemGK = metadata[2];
         DiemCK =  metadata[3];
         DiemKhac =  metadata[4];
         DiemT=  metadata[5];

        // create and return book of this metadata
        return new DiemSV( MSSV,  HoTen,  DiemGK,  DiemCK,  DiemKhac,  DiemT);
    }
    
    
    
    
}
