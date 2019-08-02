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
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        String spliter = Utils.COMMA_DELIMITER;
        return this.getStdID()+ spliter + this.getFullName()+ spliter + this.getGender() + spliter + this.getIDCard();
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
        String stdID = metaData.get(0);
        String fullName = metaData.get(1);
        String gender = metaData.get(2);
        String IDCard = metaData.get(3);

        // create and return book of this metadata
        return new Student(stdID, fullName, gender, IDCard);
    }
}
