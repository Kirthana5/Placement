/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Basic_coding_6_phrase;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
/*
An e-commerce company plans to give their customers  a discount for the New Years holiday.
The discount will be calculated on the basis of the bill amount of the order placed.
The  discount amount is the product of the sum of all odd digits and the sum of all even digits of the customers total bill amount.
 
Write an algorithm to find the discount amount for the given total bill amount.

I/P:
146153
O/P: 
100

*/
public class discount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Total Bill amount");
        int n=sc.nextInt();
        int temp=n,discount=0,odd=0,even=0,r=0;
        while(temp!=0)
        {
            r=temp%10;
            if(r%2==0)
                even+=r;
            else
                odd+=r;
            temp/=10;
        }
        discount=odd*even;
        System.out.println("Discount "+discount);
    }
    
}
