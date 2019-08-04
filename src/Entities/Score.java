/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import JavaCode.Utils;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author sieus
 */
public class Score {

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this._no);
        hash = 19 * hash + Objects.hashCode(this._stdID);
        hash = 19 * hash + Objects.hashCode(this._name);
        hash = 19 * hash + Objects.hashCode(this._middleExam);
        hash = 19 * hash + Objects.hashCode(this._finalExam);
        hash = 19 * hash + Objects.hashCode(this._plusExam);
        hash = 19 * hash + Objects.hashCode(this._avgScore);
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
        final Score other = (Score) obj;
        if (!Objects.equals(this._no, other._no)) {
            return false;
        }
        if (!Objects.equals(this._stdID, other._stdID)) {
            return false;
        }
        if (!Objects.equals(this._name, other._name)) {
            return false;
        }
        if (!Objects.equals(this._middleExam, other._middleExam)) {
            return false;
        }
        if (!Objects.equals(this._finalExam, other._finalExam)) {
            return false;
        }
        if (!Objects.equals(this._plusExam, other._plusExam)) {
            return false;
        }
        if (!Objects.equals(this._avgScore, other._avgScore)) {
            return false;
        }
        return true;
    }

    private String _no;
    private String _stdID;
    private String _name;
    private Float _middleExam;
    private Float _finalExam;
    private Float _plusExam;
    private Float _avgScore;

    public Score() {
        this._no = "";
        this._stdID = "";
        this._name = "";
        this._middleExam = (float) 0;
        this._finalExam = (float) 0;
        this._plusExam = (float) 0;
        this._avgScore = (float) 0;
    }

    public Score(String no, String stdID, String name, Float middleExam, Float finalExam, Float plusExam, Float avgScore) {
        this._no = no;
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
        if (metaData.size() <= 0) {
            return new Score();
        }
        String no = metaData.get(0);
        String stdID = metaData.get(1);
        String name = metaData.get(2);
        Float middleExam = Float.parseFloat(metaData.get(3));
        Float finalExam = Float.parseFloat(metaData.get(4));
        Float plusExam = Float.parseFloat(metaData.get(5));
        Float avgScore = Float.parseFloat(metaData.get(6));

        return new Score(no, stdID, name, middleExam, finalExam, plusExam, avgScore);
    }

    @Override
    public String toString() {
        String spliter = Utils.COMMA_DELIMITER;
        return this.getNo() + spliter + this.getStdID() + spliter + this.getName() + spliter + this.getMidleExam().toString() + spliter + this.getFinalExam().toString() + spliter + this.getPlusExam() + spliter + this.getAvgScore();
    }
    
    public String[] toStringData(String id){
        String[] data = new String[7];
        
        data[0] = id;
        data[1] = this.getStdID();
        data[2] = this.getName();
        data[3] = this.getMidleExam().toString();
        data[4] = this.getFinalExam().toString();
        data[5] = this.getPlusExam().toString();
        data[6] = this.getAvgScore().toString();
        
        return data;
    }

    public static String getString() {
        return "Score";
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
