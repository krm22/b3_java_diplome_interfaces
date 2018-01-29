package ecole;

public class Project extends Control {
	
   
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



	
	

	

