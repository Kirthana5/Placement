/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
The e-commerce company BookShelf wishes to analyse its monthly sales data between minimum range 30 to maximum range 100. The company has categorized these book sales into four groups depending on the number of sales with the help of these groups the company will know which stock they should increase or decrease in their inventory for the next month. The groups are as follows.
 
Sales Range	Groups 
30-50			D
51-60	                   C
61-80	                	B
81-100	         A
Write an algorithm to find the group for given book sale count. 
*/
package Basic_coding_6_phrase;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class sales_count {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the salesCount:");
        int salesCount=sc.nextInt();char group='-';
        if(salesCount>=30 && salesCount<=50)
            group='D';
        else if(salesCount>=51 && salesCount<=60)
            group='C';
        else if(salesCount>=61 && salesCount<=80)
            group='B';
        else if(salesCount>=81 && salesCount<=100)
            group='A';
        else
            System.out.println("Enter the value in the range 30 to 100");
        System.out.println("Group for the salesCount="+salesCount+" is "+group);
    }
    
}
