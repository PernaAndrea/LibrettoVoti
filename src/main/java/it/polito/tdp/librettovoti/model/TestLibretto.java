package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;
import java.util.*;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Test metodi Libretto \n");
		Libretto libretto= new Libretto();
		
		Voto voto1 = new Voto("Analisi 1", 30,LocalDate.of(2019, 2,15));
		libretto.add(voto1);
		
		Voto voto2 = new Voto("Informatica", 28,LocalDate.of(2019, 2,18));
		libretto.add(voto2);
		
		Voto voto3 = new Voto("Fisica 1", 25,LocalDate.of(2019, 7,15));
		libretto.add(voto3);
		
		Voto voto4 = new Voto("Chimica", 20,LocalDate.of(2019, 9,14));
		libretto.add(voto4);
		
		Voto voto5 = new Voto("Statistica", 27,LocalDate.of(2020, 2,2));
		libretto.add(voto5);
		
		Voto voto6 = new Voto("Analisi 2", 30,LocalDate.of(2020, 1,25));
		libretto.add(voto6);
		
		Voto voto7 = new Voto("Sistemi elettrici industriali", 22,LocalDate.of(2020, 6,29));
		libretto.add(voto7);
		
		Voto voto8 = new Voto("Economia ed organizzazione aziendale", 24,LocalDate.of(2020, 6,30));
		libretto.add(voto8);
		
		Voto voto9 = new Voto("Programmazione ad oggetti", 25,LocalDate.of(2021, 1,27));
		libretto.add(voto9);
		
		Voto voto10 = new Voto("Tecniche di programmazione", 30,LocalDate.of(2021, 6,19));
		libretto.add(voto10);
		
		System.out.println("TASK 1 : inserire 10 oggetti nel libretto: \n");
		System.out.println(libretto); // TASK 1
		
		//System.out.println(libretto.listavotiUguali(25));
		//oppure
		//List<Voto> venticinque = libretto.listavotiUguali(25);
		//System.out.println(venticinque);
		System.out.println("TASK 2 : stampa i voti uguali al 25 : \n");
		Libretto librettoventi5 = libretto.votiUguali(25);
		System.out.println(librettoventi5);                 // TASK 2 
		
		System.out.println("TASK 3 : cerca un corso e stampane il voto: \n");
		Voto prova = libretto.ricercaCorso("Tecniche di programmazione");
		System.out.println(prova);      									// TASK 3
	}

}
