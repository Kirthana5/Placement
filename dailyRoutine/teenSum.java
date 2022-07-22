/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dailyRoutine;

import java.util.Scanner;

/**
 *
 * @author Kirthana Balasubramanian
 */
/*
Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the range 13..19 inclusive -- 
then that value counts as 0, except 15 and 16 do not count as a teens. Write a separate helper "public int fixTeen(int n) 
{"that takes in an int value and returns that value fixed for the teen rule. In this way, you avoid repeating the teen code 3 times 
(i.e. "decomposition"). Define the helper below and at the same indent level as the main noTeenSum().

noTeenSum(1, 2, 3) → 6
noTeenSum(2, 13, 1) → 3
noTeenSum(2, 1, 14) → 3
*/
public class teenSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);int sum=0;
        int a=sc.nextInt(),b=sc.nextInt(),c=sc.nextInt();
        if(a==15 || a==16 || (a<13 || a>19))
        {
            sum+=a;
        }
        if(b==15 || b==16 || (b<13 || b>19))
        {
            sum+=b;
        }
        if(c==15 || c==16 || (c<13 || c>19))
        {
            sum+=c;
        }System.out.println("Sum "+sum);
        
        
    }
    
}
