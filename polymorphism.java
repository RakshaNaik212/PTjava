/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;

class city{
    void place(int a){
        System.out.println("chennai");
    }
    void place(int a,int b){
        System.out.println("udupi");
    }
    void place(int a,int b,int c){
        System.out.println("pune");
    }
}
public class polymorphism {
    public static void main(String[] args){
        city c=new city();
        c.place(10);
        c.place(10,20);
        c.place(10,20,30);
    }
}
