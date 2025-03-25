class TextTransformer
{
	public static String transform(String sentence)
	{
		String[] words = sentence.split(" ");
		
		StringBuilder sb = new StringBuilder();

		for(int i = 0; i < words.length; i++)
		{
			sb.append(words[i].length()).append(" ");
		}

		return sb.toString().trim();
	}
}

class SentenceReport
{
	private String originalSentence;
	private String transformedSentence;

	public SentenceReport(String originalSentence)
	{
		this.originalSentence = originalSentence;
		this.transformedSentence = TextTransformer.transform(originalSentence);
	}

	public void display()
	{
		System.out.println("Original: "+this.originalSentence+" | Transformed: "+this.transformedSentence);
	}
}

class Question3
{
	public static void main(String[] args)
	{
		String[] sentences = {
			"Java is powerful",
			"OOP makes it modular"
		};

		for(int i = 0; i < sentences.length; i++)
		{
			SentenceReport s1 = new SentenceReport(sentences[i]);
			s1.display();
		}	
	}
}