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
public class differnceHackerrank {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] elements={1,2,5,13,2};int max=0,temp=0;
        for(int i=0;i<elements.length-1;i++)
        {
            for(int j=i+1;j<elements.length;j++)
            {
                temp=Math.abs(elements[i]-elements[j]);System.out.println("IJ  "+i+"  "+j+"Temp  "+temp);
                if(max<temp)
                {
                    max=temp;System.out.println("Max  "+max);
                }
            }
            
        }
    }
    
}
