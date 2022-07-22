/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine(),rev="";
        char[] ch=s1.toCharArray();
        for(int i=ch.length-1;i>=0;i--)
        {
           rev+=ch[i]; 
        }
        System.out.println("Reverse "+rev.trim());
        if(s1.toLowerCase().equals(rev.toLowerCase()))
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
        
        //Palindrome other way
        boolean f=false;
        for(int i=0;i<s1.length()/2;i++)
        {
            if(s1.toLowerCase().charAt(i)==s1.toLowerCase().charAt(s1.length()-1-i))
                f=true;
            else
            {
                f=false;
                break;
            }
        }
        if(f==true)
            System.out.println("Palindrome");
        else
            System.out.println("Not a palindrome");
    }
    
}
