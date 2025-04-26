/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;
public class SecondMaxEle {
    public static void  main(String[] args){
        int[] arr={10,5,20,8,50};
        if(arr.length<2){
            System.out.println("array must contain at least two elementys.");
            return;
        }
        int max=Integer.MIN_VALUE;
        int secondmax=Integer.MIN_VALUE;
        for(int num:arr){
            if(num>max){
                secondmax=max;
                max=num;
            }
            else if(num>secondmax&&num!=max){
                secondmax=num;
            }
        }
        if(secondmax==Integer.MIN_VALUE){
            System.out.println("there is no distinct second maximum element");
        }else{
            System.out.println("second maximum element is:"+secondmax);
        }
    }
    
}
