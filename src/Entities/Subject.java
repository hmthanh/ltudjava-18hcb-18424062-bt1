/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.List;

/**
 *
 * @author sieus
 */
public class Subject {
    private String _subID;
    private String _name;
    private String _room;

    public Subject() {
        this._subID = "";
        this._name = "";
        this._room = "";
    }

    public Subject(String subID, String name, String room) {
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
        String subID = metaData.get(0);
        String name = metaData.get(1);
        String room = metaData.get(2);
        
        return new Subject(subID, name, room);
    }
}
