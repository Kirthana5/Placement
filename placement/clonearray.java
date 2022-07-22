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
public class clonearray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{1,2,3},{4,5,6}};
        for(int i[]:a)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        int b[][]=a.clone();
        for(int i[]:b)
        {
            for(int j:i)
                System.out.print(j+" ");
            System.out.println();
        }
        if(a==b)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
        int c[]={1,2,3,4,5,6};
        for(int i:c)
        {
                System.out.print(i+" ");
        }
        int d[]=c.clone();
        for(int i:d)
        {
                System.out.print(i+" ");
        }
        if(c==d)
        {
            System.out.println("Yes");
        }
        else
            System.out.println("No");
    }
    
}
