package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

// Java Bean o POJO
//classe con semplice contenitore di dati, non ha logica
public class Voto {
	
	private String nome; // nome del corso
	private int voto;
	private LocalDate data; //data superamento esame 
	
	// memorizza il risultato di un esame singolo
	public Voto(String nome, int voto, LocalDate data) {
		super();
		this.nome = nome;
		this.voto = voto;
		this.data = data;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getVoto() {
		return voto;
	}

	public void setVoto(int voto) {
		this.voto = voto;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Nome Esame =" + nome + ", Voto conseguito=" + voto + ", Data svolgimento esame" + data ;
	}

	
	
}
