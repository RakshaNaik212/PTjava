/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;

public class PrimeInRange {
    public static void main(String[] args){
        for(int number=1;number<=100;number++){
            boolean isprime=true;
            if(number<=1){
                continue;
            }
            for(int i=2;i<=Math.sqrt(number);i++){
                if(number%i==0){
                    isprime=false;
                    break;
                    
                }
            }
            if(isprime){
                System.out.println(number+"is aprime number");
            }
        }
    }
    
}
