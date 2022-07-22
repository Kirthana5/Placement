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
A company wishes to devise an order confirmation procedure.
They plan to require an extra confirmation instead of simply auto-confirming the order at the time it is placed.
For this purpose , the system will generate one-time password to be shared with the customer . 
The customer who is placing the order has to enter the one-time password to confirm the order.
The one –time password generated for the requested order ID, as the product of the digits in the Order ID
Write an algorithm to find the One-Time password for the order ID

Input:
2342
Output:
48

*/
public class otp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the ORDER ID");
        int id=sc.nextInt();
        int otp=1;
        int temp=id,r=0;
        while(temp!=0)
        {
            r=temp%10;
            otp*=r;
            temp/=10;
        }System.out.println("The generated OTP is "+otp);
    }
    
}
