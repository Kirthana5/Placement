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
public class mulmatrix {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a[][]={{1,1,1},{2,2,2}};    
int b[][]={{1,1},{2,2},{3,3}};  
int m=2,n=2;
    
//creating another matrix to store the multiplication of two matrices    
int c[][]=new int[m][n];  //3 rows and 3 columns  
    
//multiplying and printing multiplication of 2 matrices    
for(int i=0;i<m;i++){    
for(int j=0;j<n;j++){    
c[i][j]=0;      
for(int k=0;k<3;k++)      
{      
c[i][j]+=a[i][k]*b[k][j];      
}//end of k loop  
System.out.print(c[i][j]+" ");  //printing matrix element  
}//end of j loop  
System.out.println();//new line    
} 
    }
    
}
