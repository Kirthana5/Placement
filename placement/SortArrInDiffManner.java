/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class SortArrInDiffManner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={7,3,5,4,6,2,1};
//       Arrays.sort(a);
//       System.out.println(Arrays.toString(a));
       //sortsubarray
       int temp;
        for(int i=2;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        for(int i:a)
        {
            System.out.println(i+" ");
        }
    }
    
}
