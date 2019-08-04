/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import JavaCode.Utils;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author sieus
 */
public class Student {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this._no);
        hash = 59 * hash + Objects.hashCode(this._stdID);
        hash = 59 * hash + Objects.hashCode(this._fullName);
        hash = 59 * hash + Objects.hashCode(this._gender);
        hash = 59 * hash + Objects.hashCode(this._IDCard);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Student other = (Student) obj;
        if (!Objects.equals(this._no, other._no)) {
            return false;
        }
        if (!Objects.equals(this._stdID, other._stdID)) {
            return false;
        }
        if (!Objects.equals(this._fullName, other._fullName)) {
            return false;
        }
        if (!Objects.equals(this._gender, other._gender)) {
            return false;
        }
        if (!Objects.equals(this._IDCard, other._IDCard)) {
            return false;
        }
        return true;
    }
    
    private String _no;
    private String _stdID;
    private String _fullName;
    private String _gender;
    private String _IDCard;

    public Student(String no, String stdID, String fullName, String gender, String IDCard) {
        this._stdID = stdID;
        this._fullName = fullName;
        this._gender = gender;
        this._IDCard = IDCard;
    }

    public Student() {
        this._no = "";
        this._stdID = "";
        this._fullName = "";
        this._gender = "";
        this._IDCard = "";
    }

    public String getStdID() {
        return this._stdID;
    }
    
    /**
     * @param _stdID the _stdID to set
     */
    public void setStdID(String _stdID) {
        this._stdID = _stdID;
    }

    /**
     * @return the _fullName
     */
    public String getFullName() {
        return _fullName;
    }

    /**
     * @param _fullName the _fullName to set
     */
    public void setFullName(String _fullName) {
        this._fullName = _fullName;
    }

    /**
     * @return the _gender
     */
    public String getGender() {
        return _gender;
    }

    /**
     * @param _gender the _gender to set
     */
    public void setGender(String _gender) {
        this._gender = _gender;
    }

    /**
     * @return the _IDCard
     */
    public String getIDCard() {
        return _IDCard;
    }

    /**
     * @param _IDCard the _IDCard to set
     */
    public void setIDCard(String _IDCard) {
        this._IDCard = _IDCard;
    }


    @Override
    public String toString() {
        String spliter = Utils.COMMA_DELIMITER;
        return this._no + spliter + this.getStdID()+ spliter + this.getFullName()+ spliter + this.getGender() + spliter + this.getIDCard();
    }
    
    public String[] toStringData(String id){
        String[] data = new String[5];
        data[0] = id;
        data[1] = this.getStdID();
        data[2] = this.getFullName();
        data[3] = this.getGender();
        data[4] = this.getIDCard();
        
        return data;
    }

    public static Student readFromMetaData(List<String> metaData) {
        if(metaData.size() <= 0){
            return new Student();
        }
        String no = metaData.get(0);
        String stdID = metaData.get(1);
        String fullName = metaData.get(2);
        String gender = metaData.get(3);
        String IDCard = metaData.get(4);

        // create and return book of this metadata
        return new Student(no, stdID, fullName, gender, IDCard);
    }
    
    public static String getString(){
        return "Student";
    }

    /**
     * @return the _no
     */
    public String getNo() {
        return _no;
    }

    /**
     * @param _no the _no to set
     */
    public void setNo(String _no) {
        this._no = _no;
    }
}
