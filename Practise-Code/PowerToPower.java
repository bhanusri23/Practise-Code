/* The series, 11 + 22 + 33 + ... + 1010 = 10405071317.

Find the last ten digits of the series, 11 + 22 + 33 + ... + 10001000.*/



import java.lang.Math; 
public class HelloWorld
{
  public static void main(String[] args)
  {
     
  double sum = 0, prod;
 
  for (int i=1;i<11;i++)
  {
    prod = Math.pow(i,i);
    sum = prod + sum;
  }
  
  System.out.println("the sum is "+sum);
   
  }
}

