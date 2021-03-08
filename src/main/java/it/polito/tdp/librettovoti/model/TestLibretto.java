package it.polito.tdp.librettovoti.model;

import java.time.LocalDate;

public class TestLibretto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Test metodi Libretto");
		Libretto libretto= new Libretto();
		
		Voto voto1 = new Voto("Analisi 1", 30,LocalDate.of(2019, 2,15));
		libretto.add(voto1);
		
		Voto voto2 = new Voto("Informatica", 28,LocalDate.of(2019, 2,18));
		libretto.add(voto2);
		
		Voto voto3 = new Voto("Fisica 1", 29,LocalDate.of(2019, 7,15));
		libretto.add(voto3);
		
		Voto voto4 = new Voto("Chimica", 20,LocalDate.of(2019, 9,14));
		libretto.add(voto4);
		
		Voto voto5 = new Voto("Statistica", 27,LocalDate.of(2020, 2,2));
		libretto.add(voto5);
		
		Voto voto6 = new Voto("Analisi 2", 30,LocalDate.of(2020, 1,25));
		libretto.add(voto6);
		
		System.out.println(libretto);
	}

}
