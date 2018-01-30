package ecole;

public class Project extends Examen {
	
<<<<<<< HEAD
	private String apprieciationOrale;
	private String apprieciationEcrite;
	private double noteEcrite;
	private double noteOrale;
	
	public String getApprieciationEcrite() {
		return apprieciationEcrite;
	}

	public void setApprieciationEcrite(String apprieciationEcrite) {
		this.apprieciationEcrite = apprieciationEcrite;
	}

    public String getApprieciationOrale() {
		return apprieciationOrale;
	}
=======
	int noteOrale;
	
	@Override
	public String setApprieciationNote( double noteEcrite) throws IllegalArgumentException
	{
      try{
    	     if(noteEcrite < 0 || noteEcrite > 10 || noteEcrite < 0 )
    	     {
    		   throw new IllegalArgumentException(" Numbers must be equal to or over 0 and equal to or under 10 ");
    	     }
	    if ( noteEcrite < 5 ) 
	        {
		       this.apprieciation = " Project Ecrite apprieciation : insufficient";
		   } 
	       else if ( noteEcrite >= 5  && noteEcrite <= 7){
		       this.apprieciation =  "Project Ecrite apprieciation : passable ";  
		   } 
	       else if ( noteEcrite >= 7 && noteEcrite <= 8){
		       this.apprieciation = "Project Ecrite : good ";  
		   } 
	       else
	       {
		       this.apprieciation =  " Project Ecrite apprieciation : very good "; 
		   }
	          
       }
       catch(NullPointerException ex)
      {
    	      ex.printStackTrace();
      }
	return apprieciation;
	} 
  
>>>>>>> 741085fd50a9f33e0dbb1136ce4f788fcfcb2d10

	public void setApprieciationOrale(String apprieciationOrale) {
		this.apprieciationOrale = apprieciationOrale;
	}

	public void setNote( int noteOrale, double noteEcrite) 
	{
		this.noteEcrite = noteEcrite;
		this.noteOrale = noteOrale;
	    this.note = noteOrale + noteEcrite;
	}
	
<<<<<<< HEAD
	@Override
	public String getDetailDesNotes(){
		StringBuilder detail = new StringBuilder();
		detail.append("Projet: ").append(System.lineSeparator());
		detail.append("Note totale: ").append(this.note).append(System.lineSeparator());
		detail.append("Note écrite: ").append(this.noteEcrite).append(System.lineSeparator());
		detail.append("Appréciation écrite: ").append(this.getApprieciationEcrite()).append(System.lineSeparator());
		detail.append("Note orale: ").append(this.noteOrale).append(System.lineSeparator());
		detail.append("Appréciation orale: ").append(this.getApprieciationOrale());
		return detail.toString();
    }

};
=======
	

	public String setApprieciationNote( int noteOrale) throws IllegalArgumentException, NullPointerException
	 {
	  try{
    	     if( noteOrale < 0 || noteOrale > 10 || noteOrale < 0 )
    	     {
    		   throw new IllegalArgumentException(" Numbers must be over 0 or 20 and under ");
    	     }
	     if ( noteOrale  < 5 ) 
	        {
		       this.apprieciation =   " Project Orale apprieciation : insufficient";
		    } 
	        else if ( noteOrale >= 5  && noteOrale <= 7  )
	        {
		       this.apprieciation =  " Project Orale apprieciation : passable ";  
		    } 
	        else if (  noteOrale >= 7 && noteOrale <= 8)
	        {
		       this.apprieciation = " Project Orale apprieciation : good ";  
		    } 
	        else
	        {
		       this.apprieciation =  " Project Orale apprieciation : very good "; 
		  }
	    }
	    catch(NullPointerException ex)
	    {
	    	   ex.printStackTrace();
	     }
		   return apprieciation;
        }           
	  };
>>>>>>> 741085fd50a9f33e0dbb1136ce4f788fcfcb2d10



	
	

	

