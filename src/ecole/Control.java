package ecole;

public class Control extends Examen {
	
	private String appreciation;

	public void setNote(int examenNote) throws IllegalArgumentException
	{
	     if (examenNote < 0 || examenNote > 20 )
	     {
		   throw new IllegalArgumentException("Numbers have to be equal or above 0 and equal to , or under 20");
	     }

		this.note = examenNote;
	}
	
	public void setAppreciation(String appreciation){
		this.appreciation = appreciation;
	}

	@Override
	public String getDetailDesNotes() {
		StringBuilder detail = new StringBuilder();
		detail.append("Contrôle: ").append(System.lineSeparator());
		detail.append("Note: ").append(this.note).append(System.lineSeparator());
		detail.append("Appréciation: ").append(this.appreciation);
		return detail.toString();
	}


}
