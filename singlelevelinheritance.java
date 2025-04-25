/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MOD2;
class beta{
    void print(){
        System.out.println("executing print()....");
    }
}
class gama extends beta{
}

public class singlelevelinheritance {
    public static void main(String[] args){
        gama g=new gama();
        g.print();
    }
    
}
