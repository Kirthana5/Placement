/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyRoutine;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class permutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
// only for 3 length
        System.out.println("Hello, World!"); 
        char ch[]={'a', 'b', 'c'};
        int n=ch.length,fact=1,c=-1;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact);
        String str[]=new String[fact];
        for(int i=0;i<fact;i++)
        {
            str[i]="";
        }
        for(int i=0;i<ch.length;i++)
        {
            c++;
            str[c]+=ch[i];
            for(int j=0;j<ch.length;j++)
            {
                if(ch[i]!=ch[j]) 
                  {
                      str[c]+=ch[j];
              
                  }
            }
            c++;
            str[c]+=ch[i];
            for(int j=ch.length-1;j>=0;j--)
            {
                if(ch[i]!=ch[j])
                {
                    str[c]+=ch[j];
                }
            }
        }
        for(String s:str)
        {
            System.out.println (s);
        }
    
    }
    
}
