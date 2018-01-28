package ecole;

public class QCM extends Examen {
	
	private int numOfQuestions;
	private int nbReponsesCorrectes;
	private static final int bareme = 20;

	public QCM(int numOfQuestions) {
	    this.numOfQuestions = numOfQuestions;
	}
	
	public void setResponsesCorrecte(int nbReponsesCorrectes) {
		this.nbReponsesCorrectes = nbReponsesCorrectes;
		this.computeNote();
	}
	
	private void computeNote(){
		 this.note = (double)this.nbReponsesCorrectes / (double)this.numOfQuestions * bareme;
		 setApprieciationNote(this.note);
	}
	
	public void setApprieciationNote(double note) 
	{
	     if (note < 8 ) {
	       this.apprieciation = " QCM apprieciation : insufficient";
	        } else if ( note >= 8 && note <= 12 ){
	        this.apprieciation =  " QCM apprieciation : passable ";  
	        } else if ( note >= 12 && note <= 15 ){
	           this.apprieciation =    " QCM apprieciation : good ";   
	         } else {
	               this.apprieciation =  " QCM apprieciation : very good ";  
	          }
	       }

}