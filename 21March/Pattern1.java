class Pattern1
{
	void printPattern()
	{
		int n = 4;
		int num = 1;
		for(int i = 1; i < n; i++)
		{
			System.out.print(" ");
		}
		System.out.println(" *");
		

		for(int i = 1; i <= n; i++)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}

			System.out.print("*");

			for(int j = 1; j <= i; j++)
			{
				if(j == 1 || j == i || i == n)
				{
					System.out.print((char)('A'+j-1));
				}
				else
				{
					System.out.print(" ");
				}
				if(j != i)
				{
					System.out.print(" ");
				}
			}
			System.out.println(num++ +"*");
		}
		
		num = num -2;
		for(int i = n - 1; i >= 1; i--)
		{
			for(int j = i; j < n; j++)
			{
				System.out.print(" ");
			}

			System.out.print("*");

			for(int j = 1; j <= i; j++)
			{
				if(j == 1 || j == i)
				{
					System.out.print((char)('A' +j-1));
				}
				else
				{
					System.out.print(" ");
				}
				if(j != i)
				{
					System.out.print(" ");
				}
			}
			System.out.println(num-- + "*");
		}

		for(int i = 1; i < n; i++)
		{
			System.out.print(" ");
		}
		System.out.println(" *");
	}

	public static void main(String[] args)
	{
		Pattern1 p1 = new Pattern1();
		p1.printPattern();
	}
}