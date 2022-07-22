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
public class str_even_odd {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();String s[]=new String[T];String e="",o="";
        for(int j=0;j<T;j++)
        {
           s[j]=sc.next();
        }
        for(int j=0;j<T;j++)
        {
            e="";o="";
            for(int i=0;i<s[j].length();i++)
            {
                if(i%2==0)
                  e+=s[j].charAt(i);
                else
                  o+=s[j].charAt(i);
            }
            System.out.println(e+" "+o);

        }
    }
    
}
/*
 
*/