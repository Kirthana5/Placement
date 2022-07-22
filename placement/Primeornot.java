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
public class Primeornot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s=new Scanner(System.in);
          int flag=0;
          System.out.println("Enter n value");
                  int n=s.nextInt();
          if(n==1 || n==0)
              System.out.println("Not a prime");
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
                  System.out.println("Prime");
              else
              {
                  System.out.println("Not a prime");
              }
          }
    }
    
}
