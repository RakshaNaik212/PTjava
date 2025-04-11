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
public class prgm6 {
    public static void main(String[] args){
        int num=1010;
        int rem=0;
        int base=2;
        int i=0;
        int sum=0;
        while(num>0){
            rem=num%10;
            sum=(int) (sum+rem*Math.pow(base,i));
            i++;
            num=num/10;
        }
        System.out.println(sum);
            
        
    }
    
}
