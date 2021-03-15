package it.polito.tdp.librettovoti.model;

import java.util.*;

public class Libretto {

	//SI COMPORTA DA MODELLO
	
	private List<Voto> voti;
	private Map<String,Voto> votiMap; // identity Map: neme esame in oggetto voto
	
	public Libretto() {
		
		this.voti = new ArrayList<>();
		this.votiMap  =new HashMap<>();
	}
	/**
	 * Aggiumge un voto al libretto
	 * @param v
	 */
	public void add(Voto v) {
		this.voti.add(v);
		this.votiMap.put(v.getNome(), v);
	}
	/**
	 * Stampa il libretto
	 */
	public String toString() {
		
		String s ="";
		for(Voto i : this.voti) {
			s+= i.toString() +"\n";
		}
		return s;
	}
	
	/*public String votiUguali1(int punteggio) {
		//calcola una string contenente i voti 
		return"";
	}
	public List<Voto> votiUguali2(int punteggio){
		//crea una string con i voti 
		//meglio del votiUguali perche mi crea una lista
		//espone però all'esterno la struttura dati che ho usato
		return 
	}*/
	/**
	 * Salv ai voti in una lista libretto dei voti uguali al punteggi inserito
	 * @param punteggio
	 * @return
	 */
	public Libretto votiUguali(int punteggio) {
		Libretto risultato = new Libretto ();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
				//risultato.voti.add(v);
			}
		}
		return risultato;
	}
	/**
	 * Ricerca un Voto del corso di cui è specificato il nome 
	 * Se il corso non esiste restituisco null
	 * @param nomeCorso
	 * @return
	 */
	public Voto ricercaCorso(String nomeCorso) {
	/*	Voto risultato = null;
		for(Voto v: this.voti) {
			if(v.getNome().equals(nomeCorso)) {
				risultato = v;
				break;
			}
		}
		return risultato;*/
		return this.votiMap.get(nomeCorso); // con una mappa posso gestirla meglio cosi...
	}
	/**
	 * Verifica ch enel libretto esiste un esame con lo stesso nome e voto
	 * @param v
	 * @return
	 */
	public boolean esisteDuplicato(Voto v) {
	/*	boolean trovato = false;
		for(Voto voto:this.voti) { // con una mappa potrei evitare questa iterazione costosa
			if(voto.getNome().equals(v.getNome()) && voto.getVoto()==v.getVoto()) {
				trovato = true;
				break;
			}
		}
		return trovato;*/
	Voto trovato = this.votiMap.get(v.getNome());
	if(trovato == null) {
		return false;
	}
	if(trovato.getVoto()==v.getVoto()) {
		return true;
	}else
		return false;
	}
	/**
	 * Verifica che nel libretto c'è gia lo stesso esame (nome ) ma con votazione diversa
	 * @param v
	 * @return
	 */
	public boolean  esisteConflitto(Voto v) {
/*		boolean trovato = false;
		for(Voto voto:this.voti) { // con una mappa potrei evitare questa iterazione costosa
			if(voto.getNome().equals(v.getNome()) && voto.getVoto()!=v.getVoto()) {
				trovato = true;
				break;
			}
		}
		return trovato;*/
		Voto trovato = this.votiMap.get(v.getNome());
		if(trovato == null) {
			return false;
		}
		if(trovato.getVoto()!=v.getVoto()) {
			return true;
		}else
			return false;
	}
	/**
	 * Salva in una lista i voti uguali al punteggio inseriti
	 * @param punteggio
	 * @return
	 */
	public List<Voto> listavotiUguali(int punteggio) {
		//questo metodo risolve il problema del far visualizzare come salvo i miei dati 
		//e io ho gia salvato nella mia classe i voti
		ArrayList<Voto> risultato = new ArrayList<Voto>();
		for(Voto v : this.voti) {
			if(v.getVoto()==punteggio) {
				risultato.add(v);
			}
		}
		return risultato;
		
	}
	
}
