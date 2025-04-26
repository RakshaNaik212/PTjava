/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;

public class MinEleIndex {
    public static void main(String[] args){
        int[] arr={10,50,20,90,30};
        if (arr.length == 0){
            System.out.println("array is empty");
            return;
        }
        int min=arr[0];
        int minIndex=0;
        for(int i=1;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
                minIndex=i;
            }
        }
        System.out.println("minimum element:"+min);
        System.out.println("Index of minimum element:"+minIndex);
    }
    
}
