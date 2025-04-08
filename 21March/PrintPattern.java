class PrintPattern
{
	void printPattern()
	{
		for(int i = 1; i <= 5; i++)
		{
			
			int num = 1;

			for(int j = i; j <= 5; j++)
			{
				System.out.print(" ");
			}
			for(int j = 1; j <= i ; j=j+2)
			{
				char ch = 'A';
				if(j == 1)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("*"+ch+(num)+"*");
					num++;
					ch++;
				}				
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		PrintPattern p1 = new PrintPattern();
		p1.printPattern();	
	}
}




                         *
			*A1*
		       *A B2*
                      *A   B3*
                     *A B C D4*
		      *A   B3*
                       *A B2*
                        *A1*
			 *




class Pattern1
{
	void printPattern()
	{
		int n = 4;
		int num = 1;
		for(int i = 0; i < n; i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
		

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
				else if(i == 3 && j == 3)
				{
					System.out.print('B');
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
				if(j == 1 || j == i || i == n)
				{
					System.out.print((char)('A' +j-1));
				}
				else if(i == 3 && j == 2)
				{
					System.out.print('B');
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

		for(int i = 0; i < n; i++)
		{
			System.out.print(" ");
		}
		System.out.println("*");
	}

	public static void main(String[] args)
	{
		Pattern1 p1 = new Pattern1();
		p1.printPattern();
	}
}











