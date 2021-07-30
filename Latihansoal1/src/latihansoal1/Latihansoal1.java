/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoal1;

/**
 *
 * @author ASUS
 */
public class Latihansoal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sukupertama = 3;
        int selisih = 5;
        int jumlahsuku = 10;
        int updatenilaisuku;
        int totalnilai = 0;
        
        System.out.println("Deret Aritmatika");
        
        for(int i=1; i<=jumlahsuku; i++){
            updatenilaisuku = sukupertama; 
            sukupertama += selisih;
            System.out.println("suku ke - "+i+" : " +updatenilaisuku);
            totalnilai += updatenilaisuku;
        }
        
        System.out.println("Total Nilai : " +totalnilai);
    }
    
}

