package ecole;
import java.util.ArrayList;

public class Diplome {
	
	private ArrayList<Examen> examens = new ArrayList<Examen>();
		
	public void addExamen(Examen exam)
	{
		examens.add(exam);
	}

	private int calcMoyen()
	{
		int sumOfNotes = 0;
		int average;
		for (Examen exam : examens) {
			sumOfNotes += exam.getNote();
		}
		average = sumOfNotes / this.examens.size();
		System.out.println(average);
		return average;
	}
	
	public boolean isValide() 
	{
		return (this.calcMoyen() >= 10) ? true : false; 	
	}
	
	public void displayDetailDesNotes()
	{
		for(Examen exam : examens)
		{
		System.out.println(exam.getApprieciationNote());	
		System.out.println(exam.getNote());
		}
	}
	
	public static void main(String[] args) 
	{
			Diplome d = new Diplome();
			Examen  e = new Examen();
			Project p = new Project();
			QCM qcm = new QCM(14); 
			
			qcm.setResponsesCorrecte(18);
			
			e.setNote(18);
		    p.setNote(3, 3);
			e.getNote();
			
			d.addExamen(e);
			d.addExamen(p);
			d.addExamen(qcm);
			
			//System.out.println(d.isValide());
			
			d.displayDetailDesNotes();
    }
	
	
	
	
}
