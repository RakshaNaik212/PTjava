/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;
import java.util.Scanner;

public class strongnumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        int number=scanner.nextInt();
        int originalnumber=number;
        int sum=0;
        while(number>0){
            int digit = number%10;
            sum+=factorial(digit);
            number/=10;
        }
        if(sum==originalnumber){
            System.out.println(originalnumber+"is a strong number");
        }else{
            System.out.println(originalnumber+"is not a strong number");
        }
    }
    public static int factorial(int num){
        int fact=1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
    
}
