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