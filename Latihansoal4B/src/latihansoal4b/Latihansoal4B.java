/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihansoal4b;

/**
 *
 * @author ASUS
 */
public class Latihansoal4B {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int num1 = 5;
        int diff = 5;
        int limit = 50;
        int sum;
    
        System.out.println("Aritmatika A");
        
        for (int a=0; a<=4; a++){
            for (int i=0; i<a; i++){
                
                sum=num1;
                num1+=diff;
                
            System.out.print(" "+sum);   
        }
        System.out.println(" ");
    }
    
}
}
