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
public class Subject {

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + Objects.hashCode(this._no);
        hash = 17 * hash + Objects.hashCode(this._subID);
        hash = 17 * hash + Objects.hashCode(this._name);
        hash = 17 * hash + Objects.hashCode(this._room);
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
        final Subject other = (Subject) obj;
        if (!Objects.equals(this._no, other._no)) {
            return false;
        }
        if (!Objects.equals(this._subID, other._subID)) {
            return false;
        }
        if (!Objects.equals(this._name, other._name)) {
            return false;
        }
        if (!Objects.equals(this._room, other._room)) {
            return false;
        }
        return true;
    }

    
    private String _no;
    private String _subID;
    private String _name;
    private String _room;

    public Subject() {
        this._no = "";
        this._subID = "";
        this._name = "";
        this._room = "";
    }

    public Subject(String no, String subID, String name, String room) {
        this._no = no;
        this._subID = subID;
        this._name = name;
        this._room = room;
    }
    /**
     * @return the _subID
     */
    public String getSubID() {
        return _subID;
    }

    /**
     * @param _subID the _subID to set
     */
    public void setSubID(String _subID) {
        this._subID = _subID;
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
     * @return the _room
     */
    public String getRoom() {
        return _room;
    }

    /**
     * @param _room the _room to set
     */
    public void setRoom(String _room) {
        this._room = _room;
    }
    
    public static Subject readFromMetaData(List<String> metaData){
        if(metaData.size() <= 0){
            return new Subject();
        }
        String no = metaData.get(0);
        String subID = metaData.get(1);
        String name = metaData.get(2);
        String room = metaData.get(3);
        
        return new Subject(no, subID, name, room);
    }

    @Override
    public String toString() {
        String spliter = Utils.COMMA_DELIMITER;
        return this._no + spliter + this.getSubID() + spliter + this.getName() + spliter + this.getRoom();
    }
    
    public String toString(String idx) {
        String spliter = Utils.COMMA_DELIMITER;
        return idx + spliter + this.getSubID() + spliter + this.getName() + spliter + this.getRoom();
    }
    public String[] toStringData(String idx){
        String[] data = new String[4];
        data[0] = idx;
        data[1] = this.getSubID();
        data[2] = this.getName();
        data[3] = this.getRoom();
        
        return data;
    }
    public static String getString(){
        return "Subject";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
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
