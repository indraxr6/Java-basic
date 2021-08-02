/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoal4;

/**
 *
 * @author ASUS
 */
public class Latihansoal4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 5; //sebagai integer suku ke-1 (pertama)
        int diff = 5; //sebagai penentu selisih di setiap deret angka
        int limit = 75; //sebagai penentu batas bilangan angka deretan
        int sum; //integer bilangan setelah di jalankan operasi bilanganya
    
        System.out.println("Aritmatika B");
        
        for (int a=5; a>=1; a--){ //metode perulangan yang menentukan tinggi 
            for (int i=1; i<=a; i++){ //metode perulangan untuk menentukan jumlah kolom ke samping
                
                sum=num1;
                num1+=diff; 
                
            System.out.print(" "+sum);  //mencetak hasil operasi bilangan
        }
        System.out.println(" "); //mengganti baris perulangan setelah beberapa kali menjalankan perintah perulangan dan syaratnya
    }
    
}
}
