/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ad.listazakupow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class FileUtlls {
    private String file_name = "lista_zakupow.csv";

public void saveTofile(String text){
    try {
        FileWriter fw = new FileWriter(new File(file_name),true);
        fw.write(text);
        fw.close();
    } catch (IOException ex){
    Logger.getLogger(SaveToFile.class.getName()).log(Level.SEVERE,null,ex);
    }   
    }
}
