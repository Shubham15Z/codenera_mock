class Pattern3
{
	public void print()
	{
        	char ch = 'A';
        	int n = 6;
        
        	for (int i = 0; i < n; i++)
 		{
            		for (int j = 0; j < n - i - 1; j++) 
			{
				if(i == 0 && j == 0)
				{
					System.out.print(" ");
				}
                		System.out.print(" ");
            		}
            
            
            		for (int j = 0; j < 2 * i + 1; j++) 
            		{
                		if (j == 0 || j == 2 * i) 
                		{
                    			System.out.print(" * ");
                		} 
                		else if (i == 1 && j == 1) 
                		{ 
                    			System.out.print(ch++);
                		} 
                		else if (i == n - 1 && j % 2 == 1) 
                		{ 
                    			System.out.print(ch++);
                		} 
                		else 
                		{
                    			System.out.print(" ");
                		}
        		}
        		System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Pattern3 p3 = new Pattern3();
		p3.print();
	}
}