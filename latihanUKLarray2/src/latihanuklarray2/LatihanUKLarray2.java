/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklarray2;

/**
 *
 * @author ASUS
 */
public class LatihanUKLarray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int mA[][] = {{6,3,2},{4,2,3}};
        int mB[][] = {{1,2},{2,3},{3,1}};
        
        System.out.println("Hasil dari perkalian matriks A dan matriks B adalah ");
        
        //kosongan matrix untuk hasilnya
        int mC[][] = new int [mA.length][mB[0].length];
        
        for (int i = 0; i < mA.length ; i++){ //baris A
            for (int j = 0; j < mB[0].length; j++){  //kolom B
                for(int k = 0; k < mB.length; k++){     //kolom A atau baris B
                mC[i][j] += mA[i][k]*mB[k][j];
            }
            System.out.print(mC[i][j] + " ");
        } 
        System.out.println(" ");
    }
}
}
