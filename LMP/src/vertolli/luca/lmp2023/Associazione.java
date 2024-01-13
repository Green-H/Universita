package vertolli.luca.lmp2023;

public class Associazione extends Attivita {
	 private ScopoAssociazione scopo;
	 
	 // dichiaro gli scopi come statici e all'interno di attivita in quanto non sara necessario cambiarli e accedervi altrove
	 public static enum ScopoAssociazione{
		 RICREATIVO,CULTURALE,VOLONTARIATO
	 }

	public Associazione(String sede, int in_attivita_dal, ScopoAssociazione scopo) {
		super(sede, in_attivita_dal);
		this.scopo = scopo;
	}


	 

}
