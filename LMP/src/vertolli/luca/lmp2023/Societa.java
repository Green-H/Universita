package vertolli.luca.lmp2023;

public abstract class Societa extends Attivita{
	private String partita_IVA;
	
	public Societa(String sede, int in_attivita_dal, String partita_IVA) {
		super(sede, in_attivita_dal);
		this.partita_IVA = partita_IVA;
	}

}
