/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latianuklarray;

/**
 *
 * @author ASUS
 */
public class Latianuklarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriksA[][]={{-5,3},{7,2}};
        int matriksB[][]={{3,1},{5,-2}};
        int matriksC[][]=new int[2][2];
        
        for (int i=0; i<2; i++){
            for (int j=0; j<2; j++){
                matriksC[i][j] = matriksA[i][j]-matriksB[i][j];
                System.out.print(" "+matriksC[i][j]);
                
            }
            System.out.println(" ");
    }
    }
    
}
