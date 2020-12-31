package com.databasees1;

import java.util.Scanner;

public class Esercizio3 {
	private static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		String codiceFiscale = null;
		System.out.println("Inserisci il tuo codice fiscale ");
		codiceFiscale=input.nextLine();
		if(controlloCF(codiceFiscale)) {
			System.out.println("Il tuo CF e' valido");
		}else {
			System.out.println("CF non valido");
		}
	}
	
	
	public static boolean controlloCF(String CF) {
		char[] CFchars = CF.toCharArray();
		if(CFchars.length!=16) {
			return false;
		}
		
		for (int i=0; i<6;i++) {
	        if(!Character.isLetter(CFchars[i])) {
	            return false;
	        }
	    }
		for (int i=6; i<8;i++) {
	        if(!Character.isDigit(CFchars[i])) {
	            return false;
	        }
	    }
		if(!Character.isLetter(CFchars[8])) {
            return false;
        }
		for (int i=9; i<11;i++) {
	        if(!Character.isDigit(CFchars[i])) {
	            return false;
	        }
	    }
		if(!Character.isLetter(CFchars[11])) {
            return false;
        }
		for (int i=12; i<15;i++) {
	        if(!Character.isDigit(CFchars[i])) {
	            return false;
	        }
	    }
		if(!Character.isLetter(CFchars[15])) {
            return false;
        }
		
		

		return true;
	}



}
