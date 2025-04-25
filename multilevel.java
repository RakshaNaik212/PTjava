/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;



class whatsappv1{
    void chat(){
       System.out.println("Testing....");
    }    
}
class whatsappv2 extends whatsappv1 {
    void calling(){
        System.out.println("voice/video calling");
    }           
}
class whatsappv3 extends whatsappv2 {
    void status(){
        System.out.println("status..");
    }
}    
    
public class multilevel{
    public static void main(String[] args){
        whatsappv3 w=new whatsappv3();
        w.chat();
        w.calling();
        w.status();
        
    }
}
   