/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic_coding_6_phrase;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
/*
Write an algorithm to help the agency find the number of special characters and whitespaces in a given message .

I/p:
Gasgg54@#vscsd!s*
O/P:
4

*/
public class spl_char_whitespace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int ws=0,spl=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                ws++;
            }
            else if(!( (s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z') || (s.charAt(i)>='0' && s.charAt(i)<='9') ))
            {
                spl++;
            }
        }
        System.out.println("No. of whitespaces ="+ws+"\nNo. of Special characters ="+spl);
    }
    
}
