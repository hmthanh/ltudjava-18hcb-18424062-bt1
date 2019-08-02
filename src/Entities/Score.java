/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import JavaCode.Utils;
import java.util.List;

/**
 *
 * @author sieus
 */
public class Score {

    private String _stdID;
    private String _name;
    private Float _middleExam;
    private Float _finalExam;
    private Float _plusExam;
    private Float _avgScore;

    public Score() {
        this._stdID = "";
        this._name = "";
        this._middleExam = (float) 0;
        this._finalExam = (float) 0;
        this._plusExam = (float) 0;
        this._avgScore = (float) 0;
    }

    public Score(String stdID, String name, Float middleExam, Float finalExam, Float plusExam, Float avgScore) {
        this._stdID = stdID;
        this._name = name;
        this._middleExam = middleExam;
        this._finalExam = finalExam;
        this._plusExam = plusExam;
        this._avgScore = avgScore;
    }

    /**
     * @return the _stdID
     */
    public String getStdID() {
        return _stdID;
    }

    /**
     * @param _stdID the _stdID to set
     */
    public void setStdID(String _stdID) {
        this._stdID = _stdID;
    }

    /**
     * @return the _name
     */
    public String getName() {
        return _name;
    }

    /**
     * @param _name the _name to set
     */
    public void setName(String _name) {
        this._name = _name;
    }

    /**
     * @return the _middleExam
     */
    public Float getMidleExam() {
        return _middleExam;
    }

    /**
     * @param _middleExam the _middleExam to set
     */
    public void setMidleExam(Float _middleExam) {
        this._middleExam = _middleExam;
    }

    /**
     * @return the _finalExam
     */
    public Float getFinalExam() {
        return _finalExam;
    }

    /**
     * @param _finalExam the _finalExam to set
     */
    public void setFinalExam(Float _finalExam) {
        this._finalExam = _finalExam;
    }

    /**
     * @return the _plusExam
     */
    public Float getPlusExam() {
        return _plusExam;
    }

    /**
     * @param _plusExam the _plusExam to set
     */
    public void setPlusExam(Float _plusExam) {
        this._plusExam = _plusExam;
    }

    /**
     * @return the _avgScore
     */
    public Float getAvgScore() {
        return _avgScore;
    }

    /**
     * @param _avgScore the _avgScore to set
     */
    public void setAvgScore(Float _avgScore) {
        this._avgScore = _avgScore;
    }
    
    public static Score readFromMetaData(List<String> metaData) {
        String stdID = metaData.get(0);
        String name = metaData.get(1);
        Float middleExam = Float.parseFloat(metaData.get(2));
        Float finalExam = Float.parseFloat(metaData.get(3));
        Float plusExam = Float.parseFloat(metaData.get(4));
        Float avgScore = Float.parseFloat(metaData.get(5));

        return new Score(stdID, name, middleExam, finalExam, plusExam, avgScore);
    }

    @Override
    public String toString() {
        String spliter = Utils.COMMA_DELIMITER;
        return this.getStdID()+ spliter + this.getName() + spliter + this.getMidleExam().toString() + spliter + this.getFinalExam().toString() + spliter + this.getPlusExam() + spliter + this.getAvgScore();
    }

    
}
