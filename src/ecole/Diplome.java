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
	
	public void delivrer() throws Exception
	{
      try{
	     if(this.calcMoyen() <10){
		   throw new Exception(" The class average has fallen below 50 % ");
	       }
        }
      catch( Exception e)
      {
         e.printStackTrace();
      }
    }
	
	public static void main(String[] args) 
	{
			Diplome d = new Diplome();
			Examen  e = new Examen();
			Project p = new Project();
			QCM qcm = new QCM(20); 
			
			qcm.setResponsesCorrecte(3);
			
			e.setNote(3);
		    p.setNote(3, 3);
			e.getNote();
			
			d.addExamen(e);
			d.addExamen(p);
			d.addExamen(qcm);
			
			//System.out.println(d.isValide());
			
			d.displayDetailDesNotes();
			try {
				d.delivrer();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    }
	
	
	
	
}
