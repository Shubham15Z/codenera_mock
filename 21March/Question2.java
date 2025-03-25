class MessageFilter 
{
	public static String filter(String message, String[] bannedWords) 
	{
		for(int i = 0; i < bannedWords.length; i++)
		{
			String replacement = "*".repeat(bannedWords[i].length());
			message = message.replaceAll("\\b"+ bannedWords[i] + "\\b", replacement);
		}
		return message;
    	}
}

class FilteredMessage 
{
    	private String originalMessage;
    	private String filteredMessage;

	public FilteredMessage(String originalMessage, String[] bannedWords) 
	{
        	this.originalMessage = originalMessage;
        	this.filteredMessage = MessageFilter.filter(originalMessage,bannedWords);
    	}

    	public void display() 
	{
        	System.out.println("Original: " + originalMessage);
        	System.out.println("Filtered: " + filteredMessage);
    	}
}


public class Question2 
{
    	public static void main(String[] args) 
	{
        	String message = "This is such a dumb idea";
        	String[] bannedWords = {"dumb","is"};

        	FilteredMessage filteredMessage = new FilteredMessage(message, bannedWords);
        	filteredMessage.display();
    	}
}