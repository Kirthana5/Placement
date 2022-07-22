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
public class factorial_loop_recursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n=5,f=1;
        for(int i=1;i<=n;i++)
        {
            f*=i;
        }
        System.out.println(f);
        f=fact(n);
        System.out.println(f);
    }
    static int fact(int n)
    {
        if(n==1 || n==0)
            return 1;
        else
            return n*fact(n-1);
    }
    
}
