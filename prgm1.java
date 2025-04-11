/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java4;

/**
 *
 * @author SMV
 */
public class prgm1 
{
    public static void main(String[] args)
    {
        int n = 1234;
        int c=0;
        int r=0;
        
while(n>0)
{
    r=n%10;
    c++;
    n=n/10;
}
System.out.println(c);
    }
}
      