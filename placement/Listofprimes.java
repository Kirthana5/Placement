/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class Listofprimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        System.out.println("Enter starting and ending value:");
        int start=s.nextInt();
        int end=s.nextInt();
        for(int i=start;i<=end;i++)
        {
            if(isPrime(i))
                System.out.print(" "+i);
        }
        
    }
    public static boolean isPrime(int n)
    {
        int flag=0;
        if(n==1 || n==0)
            return false;
        else
          {
              for(int i=2;i<n;i++)
              {
                  if(n%i==0)
                  {
                      flag=1;
                      break;
                  }
              }
              if(flag!=1)
                  return true;
              else
              {
                  return false;
              }
          }
    }
    
}
