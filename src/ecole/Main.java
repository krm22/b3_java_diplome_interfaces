package ecole;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		LocalDate date = LocalDate.now();
		
		Diplome d = new Diplome();
		
		Control  e = new Control();
		e.setNote(3);
		e.setAppreciation("je t apprecie");

		Project p = new Project();
		p.setDate(LocalDate.of(2017, 2, 1));
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
		
		System.out.println("Exams under 4.00/20");
		System.out.println(" --------------------------- ");
		for (Examen examen : d.examensDontNoteInferieureA(4)) {
			System.out.println(examen.toString());
		}
		System.out.println(" --------------------------- ");
		
		System.out.println("Exams after 23/11/2018");
		System.out.println(" --------------------------- ");
		d.deleteExams(LocalDate.of(2018, 11, 23));
		for (Examen examen : d.getExamens()) {
			System.out.println(examen.toString());
		}
		System.out.println(" --------------------------- ");
		
		d.displayDetailDesNotes();
		try {
			d.delivrer();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

}
