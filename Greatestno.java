 // Write a Java Program to take 3 numbers ad find the greatest of all the 3 numbers
 
 public class Greatestno
{
 
 public static void main(String args[])
 { 
   int num1=2,num2=4,num3=5;
   if(num1> num2 && num1>num3)
   System.out.println(num1+ " is the greatest no");
   
   else if(num2>num1 && num2>num3)
   System.out.println(num2+ "is the greatest no");
   
   else
   System.out.println(num3+ "is the greatest no");
   
   }
  }