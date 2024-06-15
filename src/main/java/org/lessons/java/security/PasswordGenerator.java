package org.lessons.java.security;
import java.util.Scanner;

public class PasswordGenerator {

	public static void main(String[] args) {
	
	/*salvare in opportune variabili il <nome>, <cognome>, <colore preferito> e <data di nascita> di un utente
	  suddivisa in giorno, mese e anno in numero
      generare (e stampare a video) una password concatenando
      nome, cognome, colore preferito e somma di giorno, mese e anno di nascita, 
      separate dal carattere -
      Esempio: ho un utente che si chiama Pinco Pallo, nato il 12/05/1994,
       il cui colore preferito è il magenta La sua password sarà Pinco-Pallo-magenta-2011*/
	

		Scanner valoreUtente=new Scanner(System.in);
		System.out.println("password generation");
		//nome
		System.out.println("inserisci il tuo nome:");
		String nomeUtente = valoreUtente.nextLine();
		//cognome
		System.out.println("inserisci il tuo cognome:");
		String cognomeUtente = valoreUtente.nextLine();
		//colore preferito
		System.out.println("inserisci il tuo colore preferito:");
		String coloreUtente = valoreUtente.nextLine();
		//giorno di nascita
		System.out.println("inserisci il tuo giorno di nascita:");
		int giorno = valoreUtente.nextInt();
		//mese
		System.out.println("inserisci il tuo mese di nascita in numeri:");
		int mese = valoreUtente.nextInt();
		//anno
		System.out.println("inserisci l'anno di nascita:");
		int anno = valoreUtente.nextInt();
		valoreUtente.close();
		
		int sommaData = giorno + mese + anno;
		
		//password
		System.out.println("la tua password è: "+nomeUtente+"-"+cognomeUtente+"-"+coloreUtente+"-"+sommaData);
		
		
	}

}
