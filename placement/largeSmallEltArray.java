/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class largeSmallEltArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5};
        int min=a[0],max=a[0];
        for(int i:a)
        {
            if(i<min)
                min=i;
        }
        System.out.println(min);
         for(int i:a)
        {
            if(i>max)
                max=i;
        }
        System.out.println(max);
    }
    
}
