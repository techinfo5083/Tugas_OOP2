/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author techinfo
 */
import javax.swing.*;
public class LuasSegitiga {
    public static void main(String[] args){
        // Membuat text field untuk memasukan alas segitiga
        String alas = JOptionPane.showInputDialog("Masukan Alas");
        
        // Membuat text field untuk memasukan tinggi segitiga
        String tinggi = JOptionPane.showInputDialog("Masukan Tinggi");
        
        // Menyimpan data inputan alas ke variale a
        Double a = Double.parseDouble(alas);
        
        // Menyimpan data inputan alas ke variale t
        Double t = Double.parseDouble(tinggi);
                
        // Menghitung luas segitiga
        Double Luas = a * t * 1/2;
        
        // Menampilkan Message dengan menampilkan hasil hitung dari variable Luas
        JOptionPane.showMessageDialog(null, "Luasnya : " + Luas + " cm2");
    }
}
