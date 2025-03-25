class MessageEncoder
{
	public Message[] encodedMessages(String[] messages)
	{
		Message[] encodedMessages = new Message[messages.length];
		
		for(int i = 0; i < messages.length; i++)
		{
			encodedMessages[i] = new Message(messages[i]);
		}
		return encodedMessages;
	}
}

class Message
{
	private String originalMessage;

	private String encodedMessage;

	Message(String originalMessage)
	{
		this.originalMessage = originalMessage;
		this.encodedMessage = encode(originalMessage);
	}

	private String encode(String message) 
	{
        	return message.replaceAll("[aeiouAEIOU]", "*");
    	}
	
	public void display()
	{
		System.out.println("Original: "+this.originalMessage+" | Encoded: "+this.encodedMessage);
	}
}



class Question1
{
	public static void main(String[] args)
	{
		String[] messages = {
			"Hello there!",
			"Java is fun",
			"Object Oriented Programming"
		};
		
		MessageEncoder encoder = new MessageEncoder();
		Message[] encodedMessages = encoder.encodedMessages(messages);
		
		for(int i = 0; i < encodedMessages.length; i++)
		{
			encodedMessages[i].display();
		}
	}
}



