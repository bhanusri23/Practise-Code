
import java.lang.Math; 
public class HelloWorld
{
  public static void main(String[] args)
  {
     
  int sum = 0, prod;
 
  for (int i=1;i<11;i++)
  {
   
	prod = Math.pow(i,i);
    sum = prod + sum;
    System.out.println("the sum is "+sum);
  }
  
 // System.out.println("the sum is "+sum);
   
  }
}

