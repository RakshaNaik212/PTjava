/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;

/**
 *
 * @author SMV
 */
public class prgm1 {
    //data member
    int age=10;
    String name ="abc";
    //member function
    void read()
    {
        System.out.println("reading");
    }
    public static void main(String[] args){
        System.out.println("prgm starts");
        prgm1 oops=new prgm1();
        System.out.println("my age is:"+" "+oops.age);
        System.out.println("my name is:"+" "+oops.name);
        oops.read();
        System.out.println("prgm ends");
    }
    
    
    
    
}
