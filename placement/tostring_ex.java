package placement;

public class tostring_ex{  
 int rollno;  
 String name;  
 String city;  
  
 tostring_ex(int rollno, String name, String city){  
 this.rollno=rollno;  
 this.name=name;  
 this.city=city;  
 }  
   
 public String toString(){//overriding the toString() method  
  return rollno+" "+name+" "+city;  
 }  
 public static void main(String args[]){  
   tostring_ex s1=new tostring_ex(101,"Raj","lucknow");  
   tostring_ex s2=new tostring_ex(102,"Vijay","ghaziabad");  
     
   System.out.println(s1.toString());//compiler writes here s1.toString()  
   System.out.println(s2.toString());//compiler writes here s2.toString()  
 }  
}  