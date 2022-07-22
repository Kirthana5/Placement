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
public class arraycopy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }int b[]=new int[20];//new int[a.length]
        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
            System.out.println(a[i]+" "+b[i]);
        }
    }
    
}
