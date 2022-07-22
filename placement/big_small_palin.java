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
public class big_small_palin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine(),small="",big="";
        String[] st=s.split("\\s");
        int ind=0;
        String[] p=new String[20];
        for(String w:st)
        {
            System.out.println(w);
        }System.out.println("--------------------------------");
        for(String w:st)
        {
            boolean f=false;
            for(int i=0;i<w.length()/2;i++)
            {
                if(w.toLowerCase().charAt(i)==w.toLowerCase().charAt(w.length()-1-i))
                    f=true;
                else
                {
                    f=false;
                    break;
                }
            }
            if(f==true)
            {
                p[ind]=w;
                ind++;
            }
        }
        
        int min=p[0].length(),max=p[0].length();
        System.out.println(min+""+max);
        for(int i=0;i<p.length;i++)
        {
            if(min>p[i].length())
            {
                min=p[i].length();
                small=p[i];
                System.out.println(min+" "+small);
            }
                
            if(max<p[i].length())
            {
                max=p[i].length();
                big=p[i];
            }
                
        }
        System.out.println("Big "+big+"  Small "+small);
        
    }
    
}
