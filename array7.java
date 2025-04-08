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
public class array7 {
    public static void main(String[] args){
        int[] arr={1,2,3,4,5,6,7};
        int left=arr.length/2;
        int right=arr.length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
            
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
            
    }
    
}
