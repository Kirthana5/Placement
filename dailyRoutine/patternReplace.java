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
Given a string and a pattern, Replace all the continuous occurrence of pattern with a single X in the string. For a clear view see the example below.
Input:
The first line of input contains an integer T denoting the number of test cases.
The first line of each test case is string str.
The second line of each test case contains a string s,which is a pattern.
Output:
Print the modified string str.
Constraints:
1 ≤ T ≤ 100
1 ≤ size of str,s ≤ 1000
Example:
Input
2
abababcdefababcdab
ab
geeksforgeeks
geeks
Output
XcdefXcdX
XforX
*/
public class patternReplace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();
        System.out.println("Enter the pattern");
        String s=sc.next();
        String xstr="";int k=0;
        
        //str=str.replaceAll(s, "X");
        //System.out.println(str);
       
        for(int i=0;i<str.length()-s.length();i++)
        {
            if(str.substring(i,i+s.length()).equals(s))
                str=str.replace(str.substring(i,i+s.length()), "X");
        }System.out.println(str);
         char ch[]=str.toCharArray();
        for(int i=0;i<ch.length;i++)
        {
            //checking 1st X in sequence
            if( i<ch.length && ch[i]=='X' )
            {
                k=i;//storing the index in k
                //traversing all other X in that sequence
                while(k<ch.length && ch[k]=='X' )
                {
                    k++;
                }
                //appending the 1st X to the resultant string
                xstr+=ch[i];
                //make the i to point the 1st character after the sequence of X
                i=k-1; 
            }
            else
            {
                xstr+=ch[i];
            }
                
        }System.out.println("Output "+xstr);
    }
    
}
