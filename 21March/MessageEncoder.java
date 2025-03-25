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

class MessageEncoder
{
	public Message[] encodedMessages(String[] messages)
	{
		Message[] encodedMessages = new Message[messages.length];
		int l = messages.length;
		for(int i = 0; i < l; i++)
		{
			encodedMessages[i] = new Message(messages[i]);
		}
		return encodedMessages;
	}

	public static void main(String[] args)
	{
		String[] messages = {
			"Hello there!",
			"Java is fun",
			"Object Oriented Programming"
		};
		
		MessageEncoder encoder = new MessageEncoder();
		Message[] encodedMessages = encoder.encodedMessages(messages);
		
		for(Message message : encodedMessages)
		{
			message.display();
		}
	}
}



