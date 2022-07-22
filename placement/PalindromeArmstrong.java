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
public class PalindromeArmstrong {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner s=new Scanner(System.in);
          System.out.println("Enter n value");
          int n=s.nextInt();
          int rem,sum=0,temp;
          temp=n;
//          while(n>0)--->Palindrome
//          {
//              rem=n%10;
//              sum=(sum*10)+rem;
//              n/=10;
//          }
            while(n>0)  //Armstrong no.
            {
              rem=n%10;
              sum+=(rem*rem*rem);
              n/=10;
            }
          if(temp==sum)
              System.out.println("Palindrome "+temp);
          else
              System.out.println("Not a Palindrome "+temp);
    }
    
}
