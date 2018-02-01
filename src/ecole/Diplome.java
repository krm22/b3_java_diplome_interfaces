package ecole;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;


public class Diplome {
	
	private ArrayList<Examen> examens = new ArrayList<Examen>();
		
	public void addExamen(Examen exam)
	{
		examens.add(exam);
	}
	
	public List<Examen> examensDontNoteInferieureA(int targetNote)
	{
		// return examens.stream().filter(e -> e.getNote() < targetNote).collect(Collectors.toList());
		List<Examen> result  = new ArrayList<>(); 
		for(Examen exam : examens){
			  if(exam.getNote() < targetNote)
	          {
				 result.add(exam);
			  }
		}
		
		return result;
	}
	
	public void deleteExams(LocalDate targetDate)
	{
		examens.removeIf((Examen exam) -> exam.getDate().isBefore(targetDate));
	}
	
	private int calcMoyen()
	{
		int sumOfNotes = 0;
		int average;
		for (Examen exam : examens) {
			sumOfNotes += exam.getNote();
		}
		average = sumOfNotes / this.examens.size();
		return average;
	}
	
	public boolean isValide() 
	{   
	    getMention((this.calcMoyen()));
		return (this.calcMoyen() >= 10) ? true : false; 	
	}
	
	public void displayDetailDesNotes()
	{
		for(Examen exam : examens)
		{
			System.out.println(exam.toString());
			System.out.println(exam.getDetailDesNotes());
			System.out.println();
		}
	}
	
	public void delivrer() throws Exception
	{
      try
      {
	     if(this.calcMoyen() <10)
	     {
		   throw new Exception(" The class average has fallen below 50 % ");
	     }
      }
      catch( Exception e)
      {
         e.printStackTrace();
      }
    }
	
	public void getMention( int moyen )
	{
	
		if( moyen >= 10 && moyen <= 12 )
        {
			System.out.print(Mention.PASSABLE.getMention() + System.lineSeparator());
		}
        else if( moyen >= 12 && moyen <= 14 )
        {
        	    System.out.println(Mention.BIEN.getMention() +  System.lineSeparator());
        }
        else if( moyen >= 14 && moyen <= 16 )
        {
        		System.out.println(Mention.TRESBIEN.getMention() + System.lineSeparator());
        }
        else
        {
        		System.out.println(Mention.EXCELLANT.getMention() + System.lineSeparator()); 
        }
		
	}

	public ArrayList <Examen> getExamens(Function<Examen, Comparable> sortFunction)
	{	    
		examens.sort(Comparator.comparing(sortFunction));
		
		return examens;
	}
}
