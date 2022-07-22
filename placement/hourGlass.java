/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
/*
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0


0,0  0,1  0,2  0,3  0,4  0,5

1,0  1,1  1,2  1,3  1,4  1,5

2,0  2,1  2,2  2,3  2,4  2,5

3,0  3,1  3,2  3,3  3,4  3,5

4,0  4,1  4,2  4,3  4,4  4,5

5,0  5,1  5,2  5,3  5,4  5,5

00+01+02+11+20+21+22
01+02+03+12+21+22+23
02+03+04+13+22+23+24

*/
public class hourGlass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //2D Matrix
        Scanner sc=new Scanner(System.in);
       int arr[][]=new int[6][6];//={{1,1,1,0,0,0},{0,1,0,0,0,0},{1,1,1,0,0,0},{0,0,2,4,4,0},{0,0,0,2,0,0},{0,0,1,2,4,0}};
       for(int i=0;i<6;i++)
       {
           for(int j=0;j<6;j++)
           {
               arr[i][j]=sc.nextInt();
           }System.out.println();
       }
       int sum=0,max=Integer.MIN_VALUE,n=6;
       for(int i=0;i<n-2;i++)
       {
           
           for(int j=0;j<n-2;j++)
           {
               sum=0;
               sum+=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
//               System.out.println(arr[i][j]+" "+arr[i][j+1]+" "+arr[i][j+2]+" "+arr[i+1][j+1]+" "+arr[i+2][j]+" "+arr[i+2][j+1]+" "+arr[i+2][j+2]+" "+sum);
               if(sum>max)
                {
                    max=sum;//System.out.println("Max "+max);
                }
           }
           
       }
        System.out.println(max);
       
    }
    
}
