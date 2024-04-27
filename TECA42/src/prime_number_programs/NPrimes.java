package prime_number_programs;

public class NPrimes {

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
				System.out.println(pCount+ " = "+x);
				pCount++;
			}
			x++;
		}

	}

}
