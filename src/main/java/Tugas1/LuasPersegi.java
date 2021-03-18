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
public class LuasPersegi {
    public static void main(String[] args){
        // Membuat text field untuk menginputkan sisi persegi
        String sisi = JOptionPane.showInputDialog("Masukan Sisi");
        
        // Menyimpan hasil inputan sisi ke variable s
        Double s = Double.parseDouble(sisi);
        
        // Menghitung Luas Persegi
        Double Luas = s * s;
        
        // Menampilkan Message dengan menampilkan hasil dari variable Luas
        JOptionPane.showMessageDialog(null,"Luasnya : " + Luas + " cm2");
    }
}
