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
Given an array and a partition size, you have to partition the array with that value , then we will 
specify the partition order , you have to merge based on that order
Array : 1 2 3 4 5
Partition size 2
(so the array will be partitioned as 1 2, 3 4, 5)
Partition order 3 2 1
o/p: 5 3 4 1 2
*/
public class arrayPartition {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int arr[]={1,2,3,4,5,6,7,8};
        int psize=3,c=1,j=0;
        int porder[]={2,3,1};
        String[] str=new String[porder.length];String s="";
        for(int i=0;i<str.length;i++)
        {
            str[i]="";
        }
        for(int i=0;i<arr.length;i++)
        {
            if(c<=psize)
            {
                str[j]+=arr[i]+" ";
                c++;
            }
            else
            {
                j++;c=1;i--;
            }
        }
        for(String w:str)
        {
            System.out.println(w);
        }
        for(int i=0;i<porder.length;i++)
        {
            System.out.print(str[porder[i]-1]);
        }
    }
    
}
