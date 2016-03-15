
/*If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.

Find the sum of all the multiples of 3 or 5 below 1000.*/

import java.lang.Math; 
public class HelloWorld
{
  public static void main(String[] args)
  {
     
	int sum3 = 0, sum5 = 0, n=1, Tsum;
    for(int i=1;i<1000;i++)
    {
      if(i % 3 == 0)
      {
      	sum3 = sum3 +i;
      }
      
    }
     for(int i=1;i<1000;i++)
    {
      if(i % 5 == 0)
      {
      	sum5 = sum5 + i;
      }
    }
    
    Tsum = sum3 + sum5;
    
    System.out.println("The total sum of all the multiples of 3 and 5 is " +Tsum);
    
  }
}
