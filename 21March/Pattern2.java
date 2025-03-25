class Pattern2
{
	public void print()
	{
		char ch = 'A';
		int num = 1;
		
		for (int i=1;i<=5;i++)
		{
			
			for (int j=1;j<=5;j++)
			{
				if (i == 1)
				{
					System.out.print((char)(ch+j-1));
				}
				else if (j == 1 || i == 5)
				{
					if (i==5)
					{
						System.out.print((char)(ch+i+j-2));
					}
					else
					{
						System.out.print((char)(ch+i-1));
					}
				}
				else if (j == 5 && i != 1 && i != 5)
				{
					System.out.print(num++);
				}	
				else if ( i == 3 && j == 3)
				{
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			} 
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Pattern2 p2 = new Pattern2();
		p2.print();
	}	
}