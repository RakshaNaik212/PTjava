/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java1;

/**
 *
 * @author SMV
 */
public class pattern4 {
     public static void main(String[] args){
        for(int i=5;i>=0;i--){
            for(int j=0;j<=5-i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println( );
        }    
    }       
    
}
