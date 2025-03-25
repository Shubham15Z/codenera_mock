import java.util.*;

class CharFrequency
{
	private char character;
	private int frequency;

	public CharFrequency(char character, int frequency)
	{
		this.character = character;
		this.frequency = frequency;
	}

	public char getCharacter()
	{
		return character;
	} 

	public int getFrequency()
	{
		return frequency;
	}
}

class FrequencyAnalyzer
{
	public CharFrequency[] analyze(String message)
	{
		message = message.replaceAll(" ", "").toLowerCase();
		char[] chars = message.toCharArray();
		int length = chars.length;

		CharFrequency[] frequencies = new CharFrequency[length];

		boolean[] counted = new boolean[length];

		int count = 0;

		for(int i = 0; i < length; i++)
		{
			if(counted[i]) 
				continue;

			char currentChar = chars[i];

			int freq = 1;

			for(int j = i+1; j < length; j++)
			{
				if(chars[j] == currentChar)
				{
					freq++;
					counted[j] = true;
				}
			}

			frequencies[count++] = new CharFrequency(currentChar, freq);
		}
		CharFrequency[] result = new CharFrequency[count];
		System.arraycopy(frequencies,0,result,0,count);
		return result;		
	}
}

class Question05
{
	public static void main(String[] args)
	{
		String message = "Programming in Java";
		FrequencyAnalyzer f = new FrequencyAnalyzer();
		CharFrequency[] frequencies = f.analyze(message);

		for(int i = 0; i < frequencies.length; i++)
		{
			System.out.println("Character: "+ frequencies[i].getCharacter()+" | Frequency: "+frequencies[i].getFrequency());
		}
	}
	
}