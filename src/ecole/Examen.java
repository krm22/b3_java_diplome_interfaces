package ecole;

public abstract class Examen {

	protected double note;

	public double getNote() 
	{
		return note;
	}

	abstract public String getDetailDesNotes();

}