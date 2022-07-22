package placement;

import java.util.*;
public class Fibonacci
{
public static void main(String args[])
{
  Scanner s=new Scanner(System.in);
  int a=0,b=1,c=0;
  System.out.println("Enter n value:");
  int n=s.nextInt();
  System.out.print(a+" "+b);
  for(int i=0;i<n;i++)
  {
      c=a+b;
      System.out.print(" "+c);
      a=b;
      b=c;
      
  }
}
}