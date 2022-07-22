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
The bank SafeMoney had some dormant accounts.
The   bank charges certain monthly rates for the maintenance of these accounts. 
Because of these monthly deductions ,the balance of some of these  accounts are negative . 
The bank wishes to close these negative-value dormant accounts.
 Write an algorithm to help the bank find the number of dormant bank accountants that have a negative balance.
Example:
I/P:
10
-5- 3 8 -6 -7 18 10 -4 -3 11
O/P:
6
EXPLANATION:
The accounts that must be closed for negative balance are at indices[0, 1, 3, 4, 7, 8]i.e[-5, -3, -6, -7, -4, -3]

*/
public class dormant_bank {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the no. of accounts");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int acc[]=new int[n];
        int count=0;
        System.out.println("Enter the balance in all accounts");
        for(int i:acc)
        {
           i=sc.nextInt();
           if(i<0)
               count++;
        }
        System.out.println("No. of Accounts with -ve balance = "+count);
        
    }
    
}
