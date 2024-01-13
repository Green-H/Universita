package vertolli.luca.lmp2023;

public class Ristorante extends Societa {
	private CategoriaRistorante categoria;
	
	public static enum CategoriaRistorante{
		PIZZERIA, ITALIANO, ETNICO
	}
	
	public Ristorante(String sede, int in_attivita_dal, String partita_IVA, CategoriaRistorante categoria) {
		super(sede, in_attivita_dal, partita_IVA);
		this.categoria = categoria;
	}

}
