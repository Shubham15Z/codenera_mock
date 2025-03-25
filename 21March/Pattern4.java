class Pattern4
{
	public void print()
	{
		int num = 1;
      		int n = 1;
      		for (int i=1;i<=5;i++)
      		{
    	  		char ch = 'A';
    	 
    	  		for ( int j =1;j<=1;j++)
    	  		{
    		  		System.out.print(num+"*");
    		  		num++;
    	  		}
    	
    	  		for (int j=2;j<=i;j++)
    	  		{
    		  		if (i== 4 && ch == 'B')
    		  		{
    		  			System.out.print(" ");
    		  			ch++;
    		  		}
			
    		  		else if (i != j)
        			{
        				System.out.print(ch++ +" ");
        			}
        			else
        			{
        				System.out.print(ch+""+n);
        				n++;
        			}
			}
			System.out.println();
    	  	}
    	  	
      	}
		
	public static void main(String[] args)
	{
		Pattern4 p4 = new Pattern4();
		p4.print();
	}
}