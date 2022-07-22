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
public class count_char {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.toLowerCase();
        int count=0,punc=0,vowels=0,consonants=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' ')
                count++;
           // !, . , ' , - , " , ? , ;
           if(s.charAt(i)=='!' || s.charAt(i)=='.' || s.charAt(i)=='\'' ||s.charAt(i)=='"' || s.charAt(i)=='?' || s.charAt(i)==';')
                punc++;
           if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' )
               vowels++;
           else if(s.charAt(i)>='a' && s.charAt(i)<='z')
               consonants++;
        }
        System.out.println("No. of chars "+count+"\nNo. of Punc "+punc +"\nVowels  COnsonants  "+vowels+"   "+consonants);
    }
    
}
