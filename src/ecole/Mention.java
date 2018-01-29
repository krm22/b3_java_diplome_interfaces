package ecole;

public enum Mention {
         
	PASSABLE(" Student has a mention of : mention passable"), 
	BIEN(" Student has a mention of : mention bien"), 
	TRESBIEN(" Student has a mention of : mention très bien"), 
	EXCELLANT(" Student has a mention of : mention excellent");
	
	
	private final String mention;
	


	private Mention(String nomDuMention)
	{
		this.mention = nomDuMention;
	}
	
	public String getMention() {
		return mention;
	}
	
	
	
}
