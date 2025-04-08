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
public class array8 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6};
        int evencount=0;
        int oddcount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evencount++;
            }
            else
                oddcount++;
        }
        System.out.println("Even count:"+evencount);
        System.out.println("Odd count:"+evencount);
    }
    
}
