/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*
Example Input
4
43 345 20 987
Output
7 12 2 24
Explanation:
The file ID 0 is of 43. So, it is stored in bucket ID 7(4 + 3)
The file ID 1 is of size 345. So, it is stored in bucket ID 12(3 + 4 + 5) 
The file ID 2 is of size 20.So it is stored in bucket ID 2 (2+0)
The file ID 3 is of size 987.So it is stored in bucket ID 24 (9+8+7)

*/
package Basic_coding_6_phrase;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class bucketID {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. of files");
        int n=sc.nextInt();
        int id[]=new int[n];
        int file[]=new int[n];
        int temp=0,sum=0,r=0;
        System.out.println("Enter the file size");
        for(int i=0;i<n;i++)
        {
            file[i]=sc.nextInt();
            temp=file[i];
            while(temp!=0)
            {
                r=temp%10;
                sum+=r;
                temp=temp/10;
            }
            id[i]=sum;
            sum=0;
            r=0;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("The file ID "+i+" is of size "+file[i]+".So it is stored in bucket ID "+id[i]);
        }
    }
    
}
