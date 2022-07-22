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
public class div_str_N_eql_parts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println("Enter N");
        int N=sc.nextInt(),div,temp=0;
        String str[]=new String[N];
        if(s.length()%N==0)
        {
            div=s.length()/N;
            for(int i=0;i<s.length();i+=div)
            {
                str[temp]=s.substring(i,i+div);
                temp++;
            }
            for(int i=0;i<str.length;i++)
            {
                System.out.println(str[i]);
            }
        }
        else
        {
            System.out.println("Can't Divide");
        }
    }
    
}
