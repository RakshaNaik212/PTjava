/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;
import java.util.Scanner;
public class primenumber {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        int number=scanner.nextInt();
        if(number<=1){
            System.out.println(number+"is not a prime number");
        }else{
            boolean isPrime=true;
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.println(number+"is a primenumber");
            }else{
                System.out.println(number+"is not a primenumber");
        
            }
        }
        
    }
}
