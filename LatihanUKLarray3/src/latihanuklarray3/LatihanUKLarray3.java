/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanuklarray3;

/**
 *
 * @author ASUS
 */
public class LatihanUKLarray3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             int a[][]={{6,3,2},{4,2,3}};    
        int b[][]= {{1, 2}, {2, 3}, {3, 1}};    
       
        int c[][]=new int[a.length][b[0].length];    
     
        for(int i=0;i<a.length;i++){    
            for(int j=0;j<b[0].length;j++){    
                c[i][j]=0;      
                    for(int k=0; k<b.length; k++) {     
          
                        c[i][j]+=a[i][k]*b[k][j];      
                 }  
        System.out.print(c[i][j]+" ");  
            }
    System.out.println();
}    
}
}
