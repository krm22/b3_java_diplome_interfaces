package ecole;

public class Control extends Examen {
	
	protected int numOfQuestions;
	protected int nbReponsesCorrectes;
	private static final int bareme = 20;
	
	
	public void setNote()
	{
		 this.note = (double)this.nbReponsesCorrectes / (double)this.numOfQuestions * bareme;
		 setApprieciationNote( this.note);
	}
	
	public void setNote( double noteEcrite ) {
		 setApprieciationNote( noteEcrite );
		 this.note = (noteEcrite);
	}
	
	
	@Override
	public void setNote( int noteOrale ){
		 setApprieciationNote( noteOrale );
		 this.note = ( noteOrale );
	}
	
	



	
	
   

	
	
     

}
