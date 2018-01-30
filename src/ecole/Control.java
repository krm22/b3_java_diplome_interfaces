package ecole;

public class Control extends Examen {
	

	@Override
	public void setNote(int examenNote) throws IllegalArgumentException
	{
	     if (examenNote < 0 || examenNote > 20 )
	     {
		   throw new IllegalArgumentException("Numbers have to be equal or above 0 and equal to , or under 20");
	     }

		this.note = examenNote;
		setApprieciationNote(examenNote);
	}
     

}
