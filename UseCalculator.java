/*Write a java program Create a class Calculator add methods Addition,SUbstraction ,
Multiplication and div to it .Create object and access those methods.*/

class Calculator
{
  private int a;
  private int b;
  
  public Calculator(int a ,int b)
  {
   this.a=a;
   this.b=b;
   }
   public int add()
   {
    return a+b;
	}
	public int substract()
	{
	return a-b;
	}
	public int multiply()
	{
	 return a*b;
    }
}
public class UseCalculator
 {
	  public static void main(String args[])
	  {
	   Calculator calc=new Calculator(12,15);
	   System.out.println("a+b=" + calc.add());
	   System.out.println("a-b=" + calc.substract());
	   System.out.println("a*b=" + calc.multiply());
      }
  }
	   
  
  