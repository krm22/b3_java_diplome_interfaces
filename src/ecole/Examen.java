package ecole;

public class Examen {
	
	protected double note;
	protected String apprieciation;
    
	public double getNote() 
	{
		return note;
	}

	public void setNote(int examenNote) throws IllegalArgumentException
	{
	     if (examenNote < 0 || examenNote > 20 )
	     {
		   throw new IllegalArgumentException("Numbers have to be equal or above 0 and equal to , or under 20");
	     }

		this.note = examenNote;
		setApprieciationNote(examenNote);
	}
	
	
	public String setApprieciationNote( int examenNote ) 
	 {
	
		 if ( examenNote < 8 ) 
		 {
		       this.apprieciation = " Exam apprieciation : insufficient";
		 } 
		 else if ( examenNote >= 8  && examenNote <= 12 )
		 {
		       this.apprieciation =  " Exam apprieciation : passable ";  
		 } 
		 else if ( examenNote >= 12 && examenNote <= 15 )
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
