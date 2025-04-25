/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;
import java.util.Scanner;

public class armstrongno {
     public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        int number=scanner.nextInt();
        int originalnumber=number;
        int sum=0;
        int digits=countdigits(number);
        while(number>0){
            int digit=number%10;
            sum+=power(digit,digits);
            number/=10;
        }
        if(sum==originalnumber){
            System.out.println(originalnumber+"is a armstrong number");
        }else{
            System.out.println(originalnumber+"is not a armstrong number");
        }
    }    
    public static int countdigits(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
public static int power(int base,int exp){
    int result=1;
    for(int i=1;i<=exp;i++){
        result*=base;
    }
    return result;
}
}
        
        