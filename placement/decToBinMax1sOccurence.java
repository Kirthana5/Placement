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
public class decToBinMax1sOccurence {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=1911,r=0,t=n;
       String s="";
        while(t>0)
        {
            r=t%2;
            s+=r;
            t/=2;
        }
        String str="";
        for(int i=s.length()-1;i>=0;i--)
        {
            str+=s.charAt(i);
        }
        System.out.println(s+" "+str);
        String[] occ=str.split("0");
        int max=occ[0].length();
        for(int i=1;i<occ.length;i++)
        {
            if(max<occ[i].length())
                max=occ[i].length();
        }
        System.out.println(max);
    }
    
}
