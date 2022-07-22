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
Input: Given a list of numbers separated with a comma.The numbers 5 and 8 are present in the list.
Assume that 8 always comes after 5.
Case 1: num1 -> Add all numbers which do not lie between 5 and 8 in the Input List.
Case 2: num2 -> Numbers formed by concatenating all numbers from 5 to 8 in the list

Output: Sum of num1 and num2

Example: 3,2,6,5,1,4,8,9
Num1: 3+2+6+9 =20
Num2: 5148 
O/p=5148+20 = 5168
*/
public class array58 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int ind5=-1,ind8=-1,sum=0,res=0;
        int a[]=new int[n];String in="";System.out.println(a.length);
        System.out.println("Enter the array elements:\nNote:Always enter the element 8 after 5");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]==5) ind5=i;
            if(a[i]==8) ind8=i;
            
        }
        int ind=0;
        while(ind<ind5)
        {
            sum+=a[ind];
            ind++;
        }
        ind=ind8+1;
        while(ind<a.length)
        {
            sum+=a[ind];
            ind++;
        }
        System.out.println(sum);
        for(int i=ind5;i<=ind8;i++)
        {
            in+=a[i];
        }
        res=Integer.parseInt(in);
        sum+=res;
        System.out.println("B/W 5 & 8 "+res+"\nResult "+sum);
        
    }
    
}

















