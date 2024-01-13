package vertolli.luca.lmp2023;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LettoreFile {
	private HashMap<String, String> attributoValore;
	
	// il lettore file e la classe che si occupa di leggere i file mettendo le coppie attributo valore nell'apposita mappa
	public LettoreFile(File file) throws IOException {
		// creo la mappa in cui memorizzare le coppie
		this.attributoValore = new HashMap<String, String>();
		// f sara il nostro file, memorizzato nel buffer, da cui leggeremo ogni riga
		BufferedReader f = new BufferedReader(new FileReader(file));
		String linea;
		// scorro le linee del file finche non finiscono
		while((linea = f.readLine())!=null) {
			// separo le coppie attributo-valore e le metto in un array
			String[] coppie = linea.split(":");
			// prima dei due punti trovo l'attributo, il secondo elemento e il vaore
			attributoValore.put(coppie[0], coppie[1]);
		}
		// a questo punto attributoValore contiene tutte le coppie, posso quindi chiudere il file
		f.close();
	}
	
	public String getValore(String attributo) {
		// semplice metodo che restituisce il valore di un attributo 
		return this.attributoValore.get(attributo);
	}
}


