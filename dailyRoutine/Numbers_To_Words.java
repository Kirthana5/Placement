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
public class Numbers_To_Words {

 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner obj=new Scanner(System.in);
        String s=obj.next();
        if(s.length()>4)
            System.out.println("String's length is more than 4 digits!!");
        else
        {
            String s1[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
            String s2[]={"ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
            String s3[]={"twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninety"};
            String s4[]={"one hundred","two hundred","three hundred","four hundred","five hundred","six hundred","seven hundred","eight hundred","nine hundred"};
            String s5[]={"one thousand","two thousand","three thousand","four thousand","five thousand","six thousand","seven thousand","eight thousand","nine thousand"};
        
            char[] ch=s.toCharArray();
            int i=0;
            int len=s.length();
            while(len>0)
            {
            if(len==1)
            {
               if(ch[i]-'0'>=0)
               {
                   System.out.print(s1[ch[i]-'0']);
                   System.out.println();
               }
               break;
            }
            if(len==2)
            {
                if(ch[i]-'0'==1 && ch[i+1]-'0'==0)
                {
                   System.out.print(s2[ch[i]-'0'-1]); 
                   break;
                }  
                else if(ch[i]-'0'>=2 && ch[i]-'0'<=9 && ch[i+1]-'0'==0)
                {
                   System.out.print(s3[ch[i]-'0'-2]);
                   break;
                }
                else if(ch[i]-'0'>=2 && ch[i]-'0'<=9)
                {
                   System.out.print(s3[ch[i]-'0'-2]);
                   
                }
                else if(ch[i+1]-'0'>=0)
                {
                   System.out.print(s2[ch[i+1]-'0']); 
                   break;
                }
                len--;
                i++;
                System.out.print(" ");
            }
            if(len==3)
            {
                if(ch[i]-'0'>=1 && ch[i+1]-'0'==0 && ch[i+2]-'0'==0)
                {
                   System.out.print(s4[ch[i]-'0'-1]); 
                   break;
                } 
                else if(ch[i]-'0'>=1 && ch[i+1]-'0'==0)
                {
                   System.out.print(s4[ch[i]-'0'-1]); 
                   len--;i++;
                } 
                
                else if(ch[i]-'0'>=1)
                   System.out.print(s4[ch[i]-'0'-1]); 
                len--;
                i++;
                
                System.out.print(" ");
            }
             if(len==4)
            {
                if(ch[i]-'0'>=1 && ch[i+1]-'0'==0 && ch[i+2]-'0'==0 && ch[i+3]-'0'==0)
                {
                   System.out.print(s5[ch[i]-'0'-1]); 
                   break;
                }  
                else if(ch[i]-'0'>=1 && ch[i+1]-'0'==0 && ch[i+2]-'0'==0  )
                {
                   System.out.print(s5[ch[i]-'0'-1]); 
                   len=len-2;i=i+2;
                }
                else if(ch[i]-'0'>=1 && ch[i+1]-'0'==0 )
                {
                   System.out.print(s5[ch[i]-'0'-1]); 
                   len--;i++;
                }
                else if(ch[i]-'0'>=1 )
                   System.out.print(s5[ch[i]-'0'-1]); 
                
                len--;
                i++;
                System.out.print(" ");
            }
            
            
            }
        }
        
    }
    
}