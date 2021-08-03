/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoal5;
/**
 *
 * @author ASUS
 */
public class Latihansoal5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Pengurangan Matriks Metode Array");

        int[][] bar1 = { { -5, 3 }, { 7, 2 } };
        int[][] bar2 = { { 3, 1 }, { 5, -2 } };
        int[][] hasil = new int[2][2];

        int baris = bar1.length;
        int kolom = bar2.length;

        // Operasi matriks A
        System.out.println("Matrik A");

        for (int a = 0; a < baris; a++) {
            for (int b = 0; b < kolom; b++) {
                System.out.print(bar1[a][b] + "  ");
            }
            System.out.println();
        }

        // Operasi matriks B
        System.out.println("Matrik B");

        for (int x = 0; x < 2; x++) {
            for (int y = 0; y < 2; y++) {
                System.out.print(bar2[x][y] + "  ");
            }
            System.out.println();
        }

        // Operasi hitung pengurangan
        for (int x = 0; x < baris; x++) {
            for (int y = 0; y < kolom; y++) {
                hasil[x][y] = bar1[x][y] - bar2[x][y];
            }
        }

        // Menentukan hasil pengurangan
        System.out.println("Matriks A - B =");

        for (int x = 0; x < baris; x++) {
            for (int y = 0; y < kolom; y++) {
                System.out.print(hasil[x][y] + "  ");
            }
            System.out.println();
        }

    }

}