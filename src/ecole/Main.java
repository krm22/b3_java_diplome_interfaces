package ecole;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		Diplome d = new Diplome();
		
		Control  e = new Control();
		e.setNote(3);
		e.setAppreciation("je t apprecie");

		Project p = new Project();
		p.setNote(3, 3.5);
		p.setApprieciationOrale("appreciation orale");
		p.setApprieciationEcrite("apreciation ecrite");
		
		QCM qcm = new QCM(20); 
		qcm.setResponsesCorrecte(7);
		qcm.setDate(LocalDate.of(2018, 11, 23));
	
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
