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
Write a program to implement Zeckendorf’s theorem.

Definition: Zeckendorf’s theorem states that every positive integer can be represented uniquely as the sum of one or
more distinct Fibonacci numbers in such a way that the sum does not include any two consecutive Fibonacci numbers
Input: 64
Output: 55+8+1  0 1 1 2 3 5 8 13 21 34 55
Input: 50
Output: 34+13+3
*/
public class Zeckendorf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>0)
        {
            int fib[]=new int[n+2];
        int a=0,b=1,c=0,i=2,sum=0;
        String ind="";
        fib[0]=a;fib[1]=b;
        System.out.println(n);
        while(a+b<=n)
        {
            c=a+b;//System.out.println("C  "+c);
            fib[i]=c;
            i++;
            a=b;b=c;
        }
        for(int j=i-1;j>=0;j--)
        {
            //System.out.println(fib[j]);
            if(sum+fib[j]<=n)
            {
                sum+=fib[j];//System.out.println("sum  "+sum);
                ind+=j+" ";//System.out.println("ind  "+ind);
            }
            if(sum==n)
            {
                break;
            }
        }
        String ch[]=ind.split(" ");
        for(int j=0;j<ch.length;j++)
        {
            System.out.print(fib[Integer.parseInt(ch[j])]);
            if(j<ch.length-1)
            {
                System.out.print("+");
            }
        }
        System.out.println();
        }
        else
        {
            System.out.println("0");
        }
        
    }
    
}
