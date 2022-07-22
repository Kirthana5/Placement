/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyRoutine;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
/*
Input a2b3c15d2
Output aabbbcccccccccccccccdd
*/
public class a2b3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=sc.next(),str="",num="";
        char ch[]=s.toCharArray();int x=-1;
        for(int i=0;i>=0 && i<ch.length;)
        {
            x=-1;
            for(int j=i+1;j<ch.length;j++)
            {
                if(ch[j]>=48 && ch[j]<=57)
                    num+=ch[j];
                else
                {
                    x=j;
                    break;
                }
            }
            int c=Integer.parseInt(num);
            if(c>=1 && c<=99)
            {
                for(int j=0;j<c;j++)
                {
                    str+=ch[i];
                }
                i=x;
                num="";
            }
            else
            {
                System.out.println("Number should be between 1 && 99");
                break;
            }
        }
        System.out.println(str);
    }
    
}
