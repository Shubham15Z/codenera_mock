/*
1*2*3*4*5
1       5
1       5
1       5
1*2*3*4*5
*/

class Pattern
{
	public static void main(String args[])
	{
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if(i == 1 || i == 5)
				{
					System.out.print(j);
					if(j < 5)
					{
						System.out.print("*");
					}
				}
				else if( j== 1 || j == 5)
					System.out.print(j+" ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}
	}
	
}