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
Write a program to print the numbers in words.(upto four digits)
Eg:
100 – hundred
1023 –One Thousand two hundred three.
*/
public class numToWords {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String oneDig[]={"Zero","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
        String oddPat[]={"","Eleven","Twelve","Thirteen","Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Ninteen"};
        String twoDig[]={"","Ten","Twenty","Thirty","Forty","fifty","Sixty","Seventy","Eighty","Ninety"};
        String threeDig[]={"","One hundred","Two hundred","Three hundred","Four hundred","Five hundred","Six hundred","Seven hundred","Eight hundred","Nine hundred"};
        String fourDig[]={"","One thousand","Two thousand","Three thousand","Four thousand","Five thousand","Six thousand","Seven thousand","Eight thousand","Nine thousand"};
        Scanner sc=new Scanner(System.in);
        String s=sc.next(),words="";
        char ch[]=s.toCharArray();
         if(ch.length>4)
            System.out.println("Number has more than 4 digits!!");
        else if(ch.length==0)
            System.out.println("Empty string!");
         int len=ch.length,i=0;
        while(len!=0)
        {
            //one dig numbers
            if(len==1)
            {
                words+=(oneDig[ch[i]-'0']+" ");
                len--;
            }
            else if(len==2)
            {
                //if second digit is 0
                if(ch[i]-'0'==0)
                {
                    if(!words.contains("and "))
                        words+=("and ");
                }
                //if the number is 10
                else if(ch[i]-'0'==1 && ch[i+1]-'0'==0)
                {
                    words+=(twoDig[ch[i]-'0']+" ");
                    break;
                }
                //if it is b/w 11-19
                else if(ch[i]-'0'==1)
                {
                    words+=(oddPat[ch[i+1]-'0']+" ");
                    break;
                }
                //if it is b/w 20-99
                else if(ch[i]-'0'>=2 && ch[i]-'0'<=9)
                {
                    //if it is b/w 20-90
                    if(ch[i+1]-'0'==0)
                    {
                        words+=(twoDig[ch[i]-'0']+" ");
                        break;
                    }
                    //if it is b/w 21-99
                    else
                    {
                        words+=(twoDig[ch[i]-'0']+" ");
                    }
                }
                i++;
                len--;
            }
            else if(len==3)
            {
                //if 3rd digit is 0
                if(ch[i]-'0'==0)
                {
                    words+=("and ");
                    
                }
                //if it is 100
                else if(ch[i]-'0'>=1 && ch[i]-'0'<=9 && ch[i+1]-'0'==0 && ch[i+2]-'0'==0)
                {
                    words+=(threeDig[ch[i]-'0']+" ");
                    break;
                }   
                //if it is b/w 101-999
                else if(ch[i]-'0'>=1 && ch[i]-'0'<=9)
                {
                    words+=(threeDig[ch[i]-'0']+" ");
                    
                }
                i++;
                len--;
            }
            else if(len==4)
            {
                
                //if it is 1000
                if(ch[i]-'0'>=1 && ch[i]-'0'<=9 && ch[i+1]-'0'==0 && ch[i+2]-'0'==0 && ch[i+3]-'0'==0)
                {
                    words+=(fourDig[ch[i]-'0']+" ");
                    break;
                }
                //if it is b/w 1001-9999
                else if(ch[i]-'0'>=1 && ch[i]-'0'<=9)
                {
                    words+=(fourDig[ch[i]-'0']+" ");
                    
                }
                i++;
                len--;
            }
        }
         
        System.out.println(s+"\n"+words);
    }
    
}
