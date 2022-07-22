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
public class jaggedarray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{1,2},{3,4,5},{6,7,8,9}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i[]:a)
        {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        //to get class name(proxy class) of array since it is an object
        System.out.println(a.getClass().getName());
        
    }
    
}
