package ecole;

public abstract class Examen {
	
	protected double note;
	protected String apprieciation;
    
	public double getNote() 
	{
		return note;
	}


	
	public abstract void setNote(int examenNote);
	
	
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
   
    public String getApprieciationNote()
    {
        return apprieciation;
    }





}
