package ecole;

public abstract class Examen {

	protected double note;

	public double getNote() 
	{
		return note;
	}

<<<<<<< HEAD
	abstract public String getDetailDesNotes();
=======
	public void setNote(int examenNote) throws IllegalArgumentException
	{
	     if (examenNote < 0 || examenNote > 20 )
	     {
		   throw new IllegalArgumentException("Numbers have to be equal or above 0 and equal to , or under 20");
	     }

		this.note = examenNote;
		//setApprieciationNote(examenNote);
	}
	
	public String getApprieciationNote()
	   {
	       return apprieciation;
	   }
	

	public String setApprieciationNote( double note ) 
	 {
	
		 if ( note < 8 ) 
		 {
		       this.apprieciation = " Exam apprieciation : insufficient";
		 } 
		 else if ( note >= 8  && note <= 12 )
		 {
		       this.apprieciation =  " Exam apprieciation : passable ";  
		 } 
		 else if ( note >= 12 && note <= 15 )
		 {
		      this.apprieciation = " Exam apprieciation : good ";  
	     } 
		 else       
	     {
	          this.apprieciation =  " Exam apprieciation : very good "; 
		 }
		      return this.apprieciation;
		 }
  





>>>>>>> 741085fd50a9f33e0dbb1136ce4f788fcfcb2d10


}
