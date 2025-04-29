/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;
class Hotel{
    void eat(int a){
        System.out.println("dosa");
    }
    void eat(double d){
        System.out.println("idly");
    }
    void eat(char c){
        System.out.println("vada");
    }
}

public class Hotel1 {
    public static void main(String[] args){
        Hotel h=new Hotel();
        h.eat(10);
        h.eat(12.99);
        h.eat('a');    
    }   
}
