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
public class array6 {
    public static void main(String[] args){
        int[] n={1,7,3,4,5};
        int min=n[0];
        for(int i=0;i<n.length;i++){
            if(min>n[i]){
                min=n[i];
                
            }
        }
        System.out.println(min);
            
    }
    
}
