/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;
import java.util.Scanner;

public class factorial {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("enter a number:");
        int number = scanner.nextInt();
        long factorial=1;
        for(int i=1;i<=number;i++){
            factorial*=i;
        }
        System.out.println("the factorial of"+number+"is:"+factorial);
    }
    
}
