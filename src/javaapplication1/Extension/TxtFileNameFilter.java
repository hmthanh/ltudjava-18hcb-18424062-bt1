/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1.Extension;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author Asus
 */
public class TxtFileNameFilter implements FilenameFilter {
 
    public boolean accept(File dir, String name) {
 
        if (name.endsWith(".txt")) {
            return true;
        }
 
        return false;
    }
 
}
 
