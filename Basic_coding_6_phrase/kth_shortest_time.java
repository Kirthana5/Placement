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
A company wishes to modify the technique by which tasks in the processing queue are executed. 
There are N processes with unique IDs from 0 to N-1. Each of these tasks has its own execution time. 
The company wishes to implement a new algorithm for processing tasks. For this purpose they have identified a value K.
By the new algorithm, the processor will first process the task that has the Kth shortest execution time.
Write an algorithm to find the Kth shortest execution time.

Input:
7 5
9 -3 8 -6 -7 18 10
Output:
9
 Explanation:
The sorted list of execution times is (-7, -6, -3, 8, 9, 10, 18]
 So, the 5'h smallest execution time is 9.
*/
public class kth_shortest_time {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of processes");
        int n=sc.nextInt(),temp=0;
        int et[]=new int[n];
        System.out.println("Enter the execution time for all the "+n+" processes");
        for(int i=0;i<n;i++)
        {
            et[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(et[i]<et[j])
                {
                    temp=et[i];
                    et[i]=et[j];
                    et[j]=temp;
                }
            }
        }
        System.out.println("Enter the key 'K' value");
        int K=sc.nextInt();
        System.out.println(K+"th shortest execution time is "+et[K-1]);
        for(int i:et)
        {
            System.out.println(i);
        }
    }
    
}
