class PrintPattern2
{
	void printPattern2()
	{
		int n = 5;
		for(int i = 1; i <= n; i++)
		{
			
			System.out.print(i+"* ");
			char letter = 'A';
            		for (int j = 1; j < i - 1; j++) 
			{
                		if (j == 1 || j == i - 2 || i == n) 
				{
                    			System.out.print(letter + " ");                		
				} 
				else 
				{
                    			System.out.print("  ");
               			}
                		letter++;
            		}

            		if (i > 1) 
			{
                		System.out.print(letter +""+ (i - 1));            		
			}
			System.out.println();
		}
	}

	public static void main(String[] args)
	{
		PrintPattern2 p2 = new PrintPattern2();
		p2.printPattern2();
	}
}