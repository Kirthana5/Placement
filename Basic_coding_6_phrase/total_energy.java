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
In a science research lab,combining two nuclear chemicals produces a maximum energy that is the product of the energy of the two chemicals . 
The energy values of the chemicals can be negative or positive. 
The scientist wishes to calculate the sum of the maximized energies of the two elements when the reaction happens.
 Write an algorithm to find the total energy produced by the chemicals when the reaction happens
Input:
7
9 -3 8 -6 -7 8 10
First max & Second max
Output
19
Explanation:
The maximum product of the energies is 90..i.e 9*10 
So the sum of the energies of the chemicals is 19.


*/
public class total_energy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the no. of Chemicals");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int che[]=new int[n];
        System.out.println("Enter the energy produced for all Chemicals");
        for(int i=0;i<n;i++)
        {
           che[i]=sc.nextInt();
        }
        int temp=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(che[i]>che[j])
                {
                    temp=che[i];
                    che[i]=che[j];
                    che[j]=temp;
                }    
            }
        }
        System.out.println("Maximum product of energies is "+(che[0]*che[1])+"\nSum is "+(che[0]+che[1]));
    }
    
}
