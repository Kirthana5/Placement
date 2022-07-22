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
The company digital secure Data Solutions provides data encryption and data sharing services 
Their process uses a key k for encryption when Transmitting a number. 
To encrypt a number, each digit in the number is replaced by the following kth  digit after in the number .
The series of the digit is considered in a cyclic fashion for the last k digits.
Write an alogorithm to find the encrypted number .

i/p: 25143 3
o/p:43251
 
 Explanation:
 Replace 2 with 4 , 5 with 3, 1 with 2, 4 with 5 , and 3 with 1 .
So the output is 43251
 25143   3
1st rotation = 51432
2nd rotation = 14325
3rd rotation = 43251
*/
public class encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number & Key");
        int n=sc.nextInt();
        int k=sc.nextInt();
        int a[]=new int[100];
        int b[]=new int[100];
        int temp=n,r=0,i=0;
        while(temp!=0)
        {
            r=temp%10;
            a[i]=r;
            temp/=10;
            i++;
        }
        for(int j=i-1,x=0;j>=0;j--,x++)
        {
            b[x]=a[j];
            a[j]=0;
        }
        while(k!=0)
        {
            temp=b[0];
            for(int j=0;j<i-1;j++)
            {
                b[j]=b[j+1];           
            }
            b[i-1]=temp;
            for(int j=0;j<i;j++)
            {
                System.out.print(b[j]);
            }
            System.out.println();
            k--;
        }
        int en=0;
        for(int j=0;j<i;j++)
        {
            en+=(b[j]*(Math.pow(10,(i-j-1))));
        }
        
        System.out.println("Encrypted no. "+en);
    }
    
}
