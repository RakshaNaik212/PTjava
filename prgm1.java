/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;
abstract class Android {
    void call()
    {
        System.out.println("calling to gf");   
    }
    void text(){
        System.out.println("texting with bf");
    }
    abstract void os();
} 
class Oneplus extends Android{
    @Override
    void os(){
        System.out.println("Oxygen os");
    }
}
class redmi extends Android{
    @Override
    void os()
    {
        System.out.println("MIUI OS");
    }
}
public class prgm1 {
    public static void main(String[] args){
        Oneplus op=new Oneplus();
        op.call();
        op.text();
        op.os();
        redmi r=new redmi();
        op.call();
        op.text();
        op.os();
    }   
}
