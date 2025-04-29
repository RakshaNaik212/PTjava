/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mod2;
class game{
    void play(String name,int n){
        System.out.println("cricket");
    }
    void play(int n,String name){
        System.out.println("football");
    }
}
public class poly2 {
    public static void main(String[] args){
        game g=new game();
        g.play("virat",7);
        g.play(4,"dhoni");
    }
    
}
