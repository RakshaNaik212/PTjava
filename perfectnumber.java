/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;
import java.util.Scanner;
public class perfectnumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        int number=scanner.nextInt();
        int sum=0;
        for(int i=1;i<number;i++){
            if(number%i==0){
                sum+=i;
            }
        }
        if(sum==number){
            System.out.println(number+"is a perfectnumber");
        }else{
            System.out.println(number+"is not a perfectnumber");
        }
    }        
}
