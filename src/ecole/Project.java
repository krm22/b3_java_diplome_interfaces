package ecole;

public class Project extends Examen {
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

	public void setApprieciationOrale(String apprieciationOrale) {
		this.apprieciationOrale = apprieciationOrale;
	}

	public void setNote( int noteOrale, double noteEcrite) 
	{
		this.noteEcrite = noteEcrite;
		this.noteOrale = noteOrale;
	    this.note = noteOrale + noteEcrite;
	}
	
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
