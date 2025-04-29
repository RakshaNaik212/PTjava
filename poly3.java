/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;
class amazon{
    void payment(){
        System.out.println("COD");
    }
    void payment(String name){
        System.out.println("UPI Payment");
    }
    void payment(long cardNumber,int otp){
        System.out.println("card payment");
    }
    void payment(String username,String password){
        System.out.println("net banking");
    }
}
public class poly3 {
    public static void main(String[] args){
        amazon a=new amazon();
        a.payment();
        a.payment("GPAY");
        a.payment(12345670L,53243);
        a.payment("user123","abcd123");
    }
    
}
