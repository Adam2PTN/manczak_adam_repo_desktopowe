/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.ad.listazakupow;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class IleProduktow {
    private String file_name = "lista_zakupowe.csv";
    public void Ilosc(){
        System.out.println("test");
        int il = 0;
        try {
            Scanner sc = new Scanner (new File(file_name));
            while (sc.hasNextLine() && !sc.equals(null)){
                il ++;
            }
            System.out.println("Ilosc produktow: "+il);
        } catch (FileNotFoundException ex){
            Logger.getLogger(IleProduktow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
