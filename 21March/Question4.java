class WordReverse
{
	public static String reverseEvenWords(String sentence)
	{
		String[] words = sentence.split(" ");
		StringBuilder sb1 = new StringBuilder();
		for(int i = 0; i < words.length; i++)
		{
			StringBuilder sb2 = new StringBuilder(words[i]);
			if(i%2 == 0)
			{
				sb1.append(sb2.reverse()).append(" ");		
			}
			else
			{
				sb1.append(words[i]).append(" ");
			}
		}
		return sb1.toString().trim();
	}
}

class SentencePair
{
	private String original;

	private String processed;

	public SentencePair(String original)
	{
		this.original = original;
		this.processed = WordReverse.reverseEvenWords(original);
	}

	public void display()
	{
		System.out.println("Original: "+original+" | Processed: "+processed);
	}
}

class Question4
{
	public static void main(String[] args)
	{
		String[] sentences = {
			"Java makes coding fun",
			"Objects and classes are key"
		};

		for(int i = 0; i < sentences.length; i++)
		{
			SentencePair p = new SentencePair(sentences[i]);
			p.display();
		}
	}
}