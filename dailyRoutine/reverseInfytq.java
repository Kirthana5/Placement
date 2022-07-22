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
/*
The reverse and add function starts with a number, reverses its digits, and adds the reverse to the original.
If the sum is not a palindrome, repeat this procedure until it does. 
Write a program that takes number and gives the resulting palindrome (if one exists).
If it took more than 1,000 iterations (additions) or yield a palindrome that is greater than 4,294,967,295, assume that no palindrome exist for the given number.
Examples: 

Input : 195
Output : 9339

Input : 265
Output: 45254

Input : 196
Output : No palindrome exist

*/
public class reverseInfytq {

    /**
     * @param args the command line arguments
     */
    static int i=0;
    public static void reverseAndAdd(int num)
    {
        int temp=num,sum=0,rem=0,csum=0,crem=0;
        System.out.println(i);
        while(temp!=0)
        {
            rem=temp%10;
            sum=sum*10+rem;System.out.println(sum);
            temp/=10;
            
        }
        System.out.println(sum);
        temp=num+sum;
        System.out.println("T  "+temp);
        while(temp!=0)
        {
            crem=temp%10;
            csum=csum*10+crem;System.out.println("C "+csum);
            temp/=10;
            
        }
        if(num+sum==csum && csum>=0 && (!((long)csum>4294967295L && i>1000))) 
        {
            System.out.println(csum);
        }
        else if((long)csum>4294967295L && i>1000)
        {
            System.out.println("No palindrome exists");
        }
        else
        {
            i++;
            reverseAndAdd(csum);
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        reverseAndAdd(196);
    }
    
}
