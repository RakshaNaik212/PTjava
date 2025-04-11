/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4;

/**
 *
 * @author SMV
 */
public class prgm2 {
    public static void main(String[] args){
        int n=12345;
        int r=0;
        while(n>0){
            r=n%10;
            System.out.print(r);
            n=n/10;
        }
    }
    
}
