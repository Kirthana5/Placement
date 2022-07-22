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
public class Print_elt_in_odd_and_even_pos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={1,2,3,4,5,6,7,8,9};
        //odd
        for(int i=0;i<a.length;i+=2)
        {
            
                System.out.println((i+1)+" "+a[i]+ " ");
        }System.out.println("--------------------------");
        //even
        for(int i=1;i<a.length;i+=2)
        {
                System.out.println((i+1)+" "+a[i]+ " ");
        }
        
    }
    
}
