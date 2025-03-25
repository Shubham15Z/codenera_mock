class FrequencyAnalyzer
{
	public void analyze(String message)
	{
		char[] c1 = message.toCharArray();
		for(int i = 0; i < c1.length; i++)
		{
			if(c1[i] == ' ')
			{
				continue;
			}
			int freq = 1;
			for(int j = i+1; j < c1.length; j++)
			{
				if(c1[i] == c1[j])
				{
					freq++;
					c1[j] = ' ';
				}	
			}
			if(c1[i] != ' ')
			{
				System.out.println("Character: "+c1[i]+" Frequency: "+freq);
			}
		}
	}
}

class CharFrequency
{
	private char character;

	private int frequency;
}

class Question5
{
	public static void main(String[] args)
	{
		String message = "Programming in Java";
		FrequencyAnalyzer f1 = new FrequencyAnalyzer();
		f1.analyze(message);
	}
}