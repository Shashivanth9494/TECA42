package prime_number_programs;

public class NthPrimeNumber
{
	public static void main(String[] args)
	{
		int n=100;
		int x=1;
		int pCount=1;
		while (pCount<=n) 
		{
			int count=0;
			for (int i = 1; i <=x; i++)
			{
				if (x%i==0)
				{
					count++;
				}
			}
			if (count==2)
			{
				if (pCount==n)
				{
					System.out.println("The "+ pCount+"th Prime Number = "+x);
				}
				pCount++;
			}
			x++;
		}
	}
}
