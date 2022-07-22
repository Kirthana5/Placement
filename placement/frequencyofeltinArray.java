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
public class frequencyofeltinArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[]={2,3,4,5,2,2,6,5,7,7,9};
        int x,count=0,v=-1;
        int fr[]=new int[a.length];
        for(int i=0;i<a.length;i++)
        {
            x=a[i];
            if(fr[i]==v)
                continue;
            for(int j=i;j<a.length;j++)
            {
                if(a[j]==x)
                {
                    count++;
                    fr[j]=v;
                }
            }
            System.out.println("Frequency of "+a[i]+"= "+count);                
            count=0;
        }
    }
    
}
