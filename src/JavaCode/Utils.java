/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaCode;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static javafx.scene.input.KeyCode.T;

/**
 *
 * @author sieus
 */
public class Utils {

    public Utils() {

    }
    public static final String COMMA_DELIMITER = ",";
    public static String getRootUrl() {
        Path path = FileSystems.getDefault().getPath(".").toAbsolutePath();

        return path.toString();
    }
    
}
