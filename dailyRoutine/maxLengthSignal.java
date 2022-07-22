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
A digital machine generates binary data which consists of a string of 0s and 1s. A maximum signal M, in the data,
consists of the maximum number of either 1s or 0s appearing consecutively in the data but M can’t be at the beginning or end of the string. 
Design a way to find the length of the maximum signal.
Input
The first line of the input consists of an integer N, representing the length of the binary string. 
The second line consists of a string of length N consisting of 0s and 1s only. 
Output
Print an integer representing the length of the maximum signal.
Example
Example 1:
Input
6
101000
Output
1
Explanation
For 101000, M can be 0 at the second index or at the third index so in both cases max length = 1.
Example2:
Input
9
101111110
Output
6
Explanation
For 101111110, M = 111111 so maxlength = 6.
*/
public class maxLengthSignal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length value (n)");
        int n=sc.nextInt();System.out.println("Enter string of length "+n);
        String str=sc.next(),ind="",temp="";
        char ch[]=str.toCharArray();
        int count=0,k=0,max=0;
        System.out.println(n+"\nString "+str);
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='0')
            {
                k=i;
                while(k<ch.length && ch[k]=='0')
                {
                    ind+=k;k++;
                    count++;//System.out.println("count for 0's   "+count);
                }i=k-1;
                //System.out.println("Index 0s  "+ind);
            }
            else if(ch[i]=='1')
            {
                k=i;
                while(k<ch.length && ch[k]=='1')
                {
                    ind+=k;k++;
                    count++;//System.out.println("count for 1's   "+count);
                }i=k-1;
                //System.out.println("Index 1s   "+ind);
            }
            if(max<count && !(ind.contains("0") || ind.contains(String.valueOf(str.length()-1))))
            {
                max=count;//System.out.println("Max    "+max);
            }
            count=0;ind="";
        }
        System.out.println("Max Length "+max);
    }
    
}
