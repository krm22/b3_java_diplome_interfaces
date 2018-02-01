package ecole;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.EnumSet;
import java.util.Locale;

public abstract class Examen {

	protected double note;
	protected LocalDate date = LocalDate.now();
	
	@Override
	public String toString(){ 		
		return String.format(Locale.FRANCE, "%1$.2f/20 à l'examen du %2$td %2$tB %2$tY", note, date);
	}
	
	public void setDate(LocalDate date) {
		if(EnumSet.range(Month.JULY, Month.SEPTEMBER).contains(date.getMonth())){
			throw new IllegalArgumentException("Cet examen n'est pas valide car la date n'est pas comprise entre octobre et juin.");
		}
		
		if(EnumSet.of(DayOfWeek.SATURDAY, DayOfWeek.SUNDAY).contains(date.getDayOfWeek())){
			throw new IllegalArgumentException("Cet examen n'est pas valide car il s'est deroulé un weekend."); 
		}
		
		this.date = date;
	}

	public double getNote() 
	{
		return note;
	}
	
	public LocalDate getDate()
	{
		return date;
	}

	abstract public String getDetailDesNotes();

}