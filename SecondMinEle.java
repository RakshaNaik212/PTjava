/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;
public class SecondMinEle {
    public static void  main(String[] args){
        int[] arr={10,5,20,8,50};
        if(arr.length<2){
            System.out.println("array must have at least two elementys.");
            return;
        }
        int min=Integer.MAX_VALUE;
        int secondmin=Integer.MAX_VALUE;
        for(int num:arr){
            if(num<min){
                secondmin=min;
                min=num;
            }
            else if(num<secondmin&&num!=min){
                secondmin=num;
            }
        }
        if(secondmin==Integer.MAX_VALUE){
            System.out.println("there is no distinct second minimum element");
        }else{
            System.out.println("second minimum element is:"+secondmin);
        }
    }
    
}

    

