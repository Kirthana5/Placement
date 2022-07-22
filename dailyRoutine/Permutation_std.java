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
public class Permutation_std {

    /**
     */
    public static void permute(String str,int start,int end)
    {
        if(start==end)
        {
            System.out.println("Inside if  "+start+" "+end);
            System.out.println(str);
        }
        else
        {
            for(int i=start;i<=end;i++)
            {
                System.out.println("Before 1st swap "+str+" "+start+" "+i);
                str=swap(str,start,i);
                System.out.println("Before permute "+str+" "+(start+1)+" "+end);
                permute(str,start+1,end);
                System.out.println("Before 2nd swap "+str+" "+start+" "+i);
                str=swap(str,start,i);
            }
        }
    }
    public static String swap(String str,int i,int j)
    {
        char[] ch=str.toCharArray();
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        System.out.println("Inside swap "+String.valueOf(ch));
        return String.valueOf(ch);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int n=s.length();
        permute(s,0,n-1);
    }
    
}
