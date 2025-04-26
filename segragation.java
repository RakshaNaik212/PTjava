/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;

public class segragation {
    public static void main(String[] args){
        int[] arr={0,1,1,0,1,0,0,1};
        int left=0;
        int right=arr.length-1;
        while(left<right){
            while(arr[left]==0&&left<right){
                left++;
            }
            while(arr[right]==1&&left<right){
                right--;
            }
            if(left<right){
                arr[left]=0;
                arr[right]=1;
                left++;
                left--;
            }
        }
        System.out.print("segragated array:");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }   
}
