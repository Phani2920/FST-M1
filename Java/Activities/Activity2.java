package Activity;

public class Activity2
{
	public static void main(String arg[])
	{
		int [] numberArry = {100,77,10,54,-11,10};
		int sum=0;
		System.out.println("Result:"+ sumNumbers(numberArry,sum));
	}
	
	public static boolean sumNumbers(int[] numberArry,int sum)
	{
	for(int i=0;i<= numberArry.length-1;i++)
	{
		if(numberArry[i]==10)
		{
			sum =sum+numberArry[i];				
		}
	}
	System.out.println(sum);

	/*if (sum == 30)
	{
		return true;
	}
		else
		{
			return false;
		} */
	return sum == 30;
			
	}
	
   }


