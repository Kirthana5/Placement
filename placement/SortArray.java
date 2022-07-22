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
public class SortArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Sorting + 2nd largest & 3rd smallest
        
        int a[]={2,3,1,7,5};int temp;
        
        for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
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
        System.out.println("2nd Largest "+a[a.length-2]+"\n3rd Largest "+a[a.length-3]+"\n2nd Smallest "+a[1]);
         for(int i=0;i<a.length;i++)
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]<a[j])
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
