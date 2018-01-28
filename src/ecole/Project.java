package ecole;

public class Project extends Examen {
	
	 public void setNote( double noteEcrite, int noteOrale) {
		 setApprieciationNote( noteEcrite );
		 setApprieciationNote( noteOrale );
		 this.note = (noteEcrite + noteOrale);
	 }
	 
	
	public String setApprieciationNote( double noteEcrite)
	 {
	     if ( noteEcrite < 5 ) {
		       this.apprieciation =   " Project Ecrite apprieciation : insufficient";
		         } else if ( noteEcrite >= 5  && noteEcrite <= 7){
		         this.apprieciation =  " Project Ecrite apprieciation : passable ";  
		         } else if ( noteEcrite >= 7 && noteEcrite <= 8){
		           this.apprieciation = " Project Ecrite : good ";  
		          } else {
		                this.apprieciation =  " Project Ecrite apprieciation : very good "; 
		           }
	     return this.apprieciation ;
     }
	
	
	
	@Override
	public String setApprieciationNote( int noteOrale)
	 {
	     if ( noteOrale  < 5 ) {
		       this.apprieciation =   " Project Orale apprieciation : insufficient";
		         } else if ( noteOrale >= 5  && noteOrale <= 7  ){
		         this.apprieciation =  " Project Orale apprieciation : passable ";  
		         } else if (  noteOrale >= 7 && noteOrale <= 8){
		           this.apprieciation = " Project Orale apprieciation : good ";  
		          } else {
		                this.apprieciation =  " Project Orale apprieciation : very good "; 
		           }
	     return this.apprieciation ;
    }
	           
	 



};
	
	

	

