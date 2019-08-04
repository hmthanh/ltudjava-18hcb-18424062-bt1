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
public class Account {

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + Objects.hashCode(this._userName);
        hash = 79 * hash + Objects.hashCode(this._password);
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
        final Account other = (Account) obj;
        if (!Objects.equals(this._userName, other._userName)) {
            return false;
        }
        if (!Objects.equals(this._password, other._password)) {
            return false;
        }
        return true;
    }
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
        if(metaData.size() <= 0){
            return new Account();
        }
        String userName = metaData.get(0);
        String password = metaData.get(1);
        
        return new Account(userName, password);
    }

    @Override
    public String toString() {
        String spliter = Utils.COMMA_DELIMITER;
        return this.getUserName()+ spliter + this.getPassword();
    }
    
    public static String getString(){
        return "Account";
    }
    
}
