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
public class Test {
    public static void main(String[] args){
        employee e = new employee();
        System.out.println(e.id);
        System.out.println(e.des);
        System.out.println(e.sal);
        
        e.work();
    }
    
}
