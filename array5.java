/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java3;

/**
 *
 * @author SMV
 */
public class array5 {
    public static void main(String[] args){
        int[] n={1,7,3,5,4};
        int max=0;
        for(int i=0;i<n.length;i++){
            if(max<n[i]){
                max=n[i];
            }
        }
        System.out.println((max));
    }
    
}
