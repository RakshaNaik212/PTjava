/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;
abstract class Hotstar{
    void login()
    {
        System.out.println("Login successful");
    }
    
}
class HotstarFree extends Hotstar{
    void watch()
    {
        System.out.println("Watch with ads");   
    }
}
class HotstarPremium extends Hotstar{
    void watch()
    {
        System.out.println("Watch without ads");   
    }
}
public class HotstarMain {
    public static void main(String[] args){
        HotstarFree hf =new HotstarFree();
        hf.login();
        hf.watch();
        HotstarPremium hp=new HotstarPremium();
        hp.login();
        hp.watch();
        
    }
    
}
