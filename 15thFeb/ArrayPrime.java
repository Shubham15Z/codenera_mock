class ArrayPrime
{
	public static void main(String args[])
	{
		int a[] = {4,7,9,3,47};
		System.out.println("The prime numbers in given array are :");
		for(int i = 0; i < a.length; i++)
		{
			int count = 0;
			for(int j = 1; j <= a[i]; j++)
			{
				if(a[i] % j == 0)
				{
					count++;
				}
			}
			if(count == 2)
			{
				System.out.print(a[i]+" ");
			}
		}
	}
}

