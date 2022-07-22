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
public class anagram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        char ch[],t;
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if(s1.length()==s2.length())
        {
            ch=s1.toCharArray();
            
            for(int j=0;j<ch.length;j++)
            {
               for(int i=j+1;i<ch.length;i++) 
               {
                   if(ch[j]>ch[i])
                {
                   t=ch[j];
                   ch[j]=ch[i];
                   ch[i]=t;
                }
               }
                
            }s1=new String(ch);
            System.out.println(s1);
            
            ch=s2.toCharArray();
            
            for(int j=0;j<ch.length;j++)
            {
               for(int i=j+1;i<ch.length;i++) 
               {
                   if(ch[j]>ch[i])
                {
                   t=ch[j];
                   ch[j]=ch[i];
                   ch[i]=t;
                }
               }
                
            }s2=new String(ch);
            System.out.println(s2);
            
            System.out.println((s1.equals(s2))?"Both are Anagram":"Not an Anagram");
        }
        else
        {
            System.out.println("Not an Anagram!!");
        }
    }
    
}
