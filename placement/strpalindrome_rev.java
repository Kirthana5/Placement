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
public class strpalindrome_rev {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s,r="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string");
        s=sc.nextLine().toLowerCase();
        for(int i=s.length()-1;i>=0;i--)
        {
            r+=s.charAt(i);
        }
        System.out.println(r);
        if(s.equals(r))
        {
            System.out.println("Palindrome");
        }
        else
            System.out.println("Not a Palindrome");
    }
    
}
