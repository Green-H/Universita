package vertolli.luca.lmp2023;

public class Negozio extends Societa {
	private String merce_venduta;
	public Negozio(String sede, int in_attivita_dal, String patita_IVA, String merce_venduta) {
		super(sede, in_attivita_dal, patita_IVA);
		this.merce_venduta = merce_venduta;
	}

}
