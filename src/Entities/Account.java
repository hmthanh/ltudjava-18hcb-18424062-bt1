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
public class Account {
    private String _userName;
    private String _password;

    public Account() {
    }

    public Account(String _userName, String _password) {
        this._userName = _userName;
        this._password = _password;
    }

    /**
     * @return the _userName
     */
    public String getUserName() {
        return _userName;
    }

    /**
     * @param _userName the _userName to set
     */
    public void setUserName(String _userName) {
        this._userName = _userName;
    }

    /**
     * @return the _password
     */
    public String getPassword() {
        return _password;
    }

    /**
     * @param _password the _password to set
     */
    public void setPassword(String _password) {
        this._password = _password;
    }
    
    public static Account readFromMetaData(List<String> metaData){
        String userName = metaData.get(0);
        String password = metaData.get(1);
        
        return new Account(userName, password);
    }
}
