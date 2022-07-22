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
public class data_types {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        int j=scan.nextInt();
        double dd=scan.nextDouble();
        scan.nextLine();
        String str=scan.nextLine();
        System.out.println((i+j)+"\n"+(d+dd));
        System.out.println(s+str);
    }
    
}
