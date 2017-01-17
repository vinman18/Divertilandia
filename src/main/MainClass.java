package main;

import java.sql.Date;
import java.util.ArrayList;

import entita.Offerta;
import entita.ParcoDivertimenti;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DbHelper dh = new DbHelper();
		
		ArrayList<ParcoDivertimenti> parchi = dh.getInfoParchiDivertimento();
		
		for(ParcoDivertimenti p : parchi) {
			System.out.println(p.toString());
		}
		
		System.out.println("");
		ArrayList<Offerta> offerte = dh.getOffertePerPeriodo(Date.valueOf("2017-01-01"), Date.valueOf("2017-02-28"));
		
		for(Offerta o : offerte) {
			System.out.println(o.toString());
		}
		
		System.out.println("");
		ArrayList<Offerta> offerte2 = dh.getOffertePerAttivita("L'enigma di Joker", true);
		
		for(Offerta o : offerte2) {
			System.out.println(o.toString());
		}
		
		System.out.println("");
		ArrayList<Offerta> offerte3 = dh.getOffertePerAttivita("L'enigma di Joker", false);
		
		for(Offerta o : offerte3) {
			System.out.println(o.toString());
		}
	}

}