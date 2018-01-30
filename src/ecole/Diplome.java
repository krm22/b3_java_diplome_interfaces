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
			System.out.println(exam.getDetailDesNotes() + System.lineSeparator());

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
			Control  e = new Control();
			Project p = new Project();
			QCM qcm = new QCM(20); 
			
			
			qcm.setResponsesCorrecte(5);
		
			e.setNote(3);
			e.setAppreciation("je t apprecie");
		    p.setNote(3, 3.5);
		    p.setApprieciationOrale("appreciation orale");
		    p.setApprieciationEcrite("apreciation ecrite");

			d.addExamen(e);
			d.addExamen(p);
			d.addExamen(qcm);
			
			System.out.println(d.isValide());
			
			d.displayDetailDesNotes();
			try {
				d.delivrer();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
    }
	
	
	
	
}
