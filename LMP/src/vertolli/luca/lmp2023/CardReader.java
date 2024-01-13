package vertolli.luca.lmp2023;

import java.io.File;
import java.io.IOException;

import vertolli.luca.lmp2023.Associazione.ScopoAssociazione;
import vertolli.luca.lmp2023.Ristorante.CategoriaRistorante;



public class CardReader {
	// questa classe fa da factory per le varie attivita a seconda di cosa legge nella coppia filetype
	public Attivita creaAttivita(File file) throws IOException {
		//leggiamo il file con il nostro lettore creando la mappa
		LettoreFile l = new LettoreFile(file);
		//determiniamo che tipo di attivita creare a seconda del filetype
		String tipo = l.getValore("filetype");
		//creiamo l'attivita da ritornare
		Attivita a;
		switch (tipo) {
		case "negozio": {
			return a = new Negozio(l.getValore("sede"), Integer.valueOf(l.getValore("in_attivita_dal")), l.getValore("partita_IVA"), l.getValore("merce_venduta"));
			
		}case "ristorante": {
			
			return a = new Ristorante(l.getValore("sede"), Integer.valueOf(l.getValore("in_attività_dal")),l.getValore("partita_IVA"),CategoriaRistorante.valueOf(l.getValore("categoria")));
		}case "associazione":{
			return a = new Associazione(l.getValore("sede"),Integer.valueOf(l.getValore("in_attività_dal")),ScopoAssociazione.valueOf(l.getValore("scopo")));
			}
		// per creare nuovi card reader con il codice attuale occorre scrivere una classe che rappresenta l'attivita richiesta e aggiungere un costruttore in questo switch
		// la richiesta del fornire nuovi card reader potrebbe indicare il leggere un file e creare dinamicamente le classi corrispondenti a tali attivita?
		default:
			// in tal caso qui andrebbe messo il codice necessario a creare una classe a partire dal file
			throw new IllegalArgumentException("Unexpected value: " + tipo);
		}
		
	}
	
	
	
}
