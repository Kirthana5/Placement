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
Given a String with numbers and operators. Perform the operation on the numbers in their respective order.
Operator precedence need not be considered. The input string will have the numbers followed by the operators.

Input: "12345 * + - + "
Result: 6 [Explanation: 1 * 2 + 3 - 4 + 5 = 6]
Input: "374291 - - * + -"
Result: -4 [Explanation: 3 - 7 - 4 * 2 + 9-1
*/
public class postFix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s="897633241 + - - * - + + *";//8+9-7-6*3-3+2+4*1=15
        String str[]=s.split("\\s");
        int res=0;
        for(String ss:str)
        {
            System.out.println(ss);
        }
        char num[]=str[0].toCharArray();
        for(char ss:num)
        {
            System.out.println(ss);
        }System.out.println("------------------------");
        if(str[1].equals("+"))
            res=((int)num[0]-'0')+((int)num[1]-'0');
        if(str[1].equals("-"))
           res=((int)num[0]-'0')-((int)num[1]-'0');
        if(str[1].equals("*"))
           res=((int)num[0]-'0')*((int)num[1]-'0');
        for(int i=2,j=2;i<num.length;i++,j++)
        {
           if(str[j].equals("+"))
               res+=(int)num[i]-'0';
           else if(str[j].equals("-"))
               res-=(int)num[i]-'0';
           else if(str[j].equals("*"))
               res*=(int)num[i]-'0';
                
        }System.out.println(res);
    }
    
}
