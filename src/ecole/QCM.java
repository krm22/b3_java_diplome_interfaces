package ecole;

public class QCM extends Examen {
	protected int numOfQuestions;
	protected int nbReponsesCorrectes;
	

   public QCM(int numOfQuestions) throws IllegalArgumentException, NullPointerException
	{
	 try
	 {
         if(numOfQuestions < 0)
         {
        	    throw new NullPointerException("Numbers must be over 0");
         }
            this.numOfQuestions = numOfQuestions;
	     }
         catch(IllegalArgumentException e)
         {
        	   throw new IllegalArgumentException("Negative numbers are not allowed"); 
         }
       
	 }
	
	public void setResponsesCorrecte(int nbReponsesCorrectes) throws IllegalArgumentException ,NullPointerException
	{
	 try
	 {
	    if(nbReponsesCorrectes < 0 || nbReponsesCorrectes > 20)
	    {
	    	  throw new IllegalArgumentException("Numbers must be over 0 and either equal to or under 20");
	    }
	      this.nbReponsesCorrectes = nbReponsesCorrectes;
	      this.note = (double)this.nbReponsesCorrectes / (double)this.numOfQuestions * this.numOfQuestions;
	 } 
	 catch(NullPointerException e)
     {
     	throw new NullPointerException("Negative numbers are not allowed"); 
     }
		 
    }

	@Override
	public String getDetailDesNotes() {
		StringBuilder detail = new StringBuilder();
		detail.append("QCM: ").append(System.lineSeparator());
		detail.append("Note: ").append(this.note).append(System.lineSeparator());
		detail.append("Appréciation: ").append(this.getAppreciation());
		return detail.toString();
	}
	
	

	private String getAppreciation() {
		String apprieciation = "";
		 if (this.note < 8) 
	     {
	        apprieciation = " QCM apprieciation : insufficient";
	     }
	     else if ( this.note >= 8 && this.note <= 12 )
	     {
	        apprieciation =  " QCM apprieciation : passable ";  
	     } 
	     else if ( this.note >= 12 && this.note <= 15 )
	     {
	        apprieciation =  " QCM apprieciation : good ";   
	     } 
	     else 
	     {
	        apprieciation =  " QCM apprieciation : very good ";  
	     }
		return apprieciation;
	}

}




}