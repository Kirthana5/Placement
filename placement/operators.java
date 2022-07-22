/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package placement;

/**
 *
 * @author Kirthana Balasubramanian
 */
public class operators
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double meal_cost=12;
        int tip_percent=20,tax_percent=8;
        double tip=((double)tip_percent/100)*meal_cost;
        System.out.println(tip);
        double tax=((double)tax_percent/100)*meal_cost;
        System.out.println(tax);
        double total_cost=meal_cost+tip+tax;
        System.out.println(Math.round(total_cost));
    }
    
}
