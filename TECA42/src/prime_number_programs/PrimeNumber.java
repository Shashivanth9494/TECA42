package prime_number_programs;

public class PrimeNumber 
{
	public static void main(String[] args)
	{
		int num=13;
		int count=0;
		for (int i = 1; i <=num; i++) 
		{
			if (num%i==0) 
			{
				count++;
			}			
		}	
		System.out.println(count);
		if (count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not a Prime Number");
		}
	}
}
