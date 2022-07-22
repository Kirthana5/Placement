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
public class leftRytRotateArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5};
        int a1[]={1,2,3,4,5};
        Scanner sc=new Scanner(System.in);
         int temp1,temp2;
        System.out.println("Enter no. of times have to rotate");
        int n=sc.nextInt();
        for(int k=0;k<n;k++)
        {
          System.out.println(k+"-->");
        temp1=a[0];
        for(int i=0;i<a.length-1;i++)
        {
            a[i]=a[i+1];
        }
        a[a.length-1]=temp1;
        for(int i:a)
        {
            System.out.print(i+" ");
        }
            System.out.println();
            System.out.println(k+"-->");
        temp2=a1[a1.length-1];
        for(int i=a1.length-1;i>0;i--)
        {
            a1[i]=a1[i-1];
        }
        a1[0]=temp2;
        for(int i:a1)
        {
            System.out.print(i+" ");
        }
            System.out.println();
        }
    }
    
}
