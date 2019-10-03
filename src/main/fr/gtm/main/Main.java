package fr.gtm.main;

import java.util.Scanner;

import fr.gtm.bovoyage.dao.DestinationMockDAO;
import fr.gtm.bovoyage.entities.Destination;
import fr.gtm.bovoyage.facade.DestinationFacade;

public class Main {

	public static void main(String[] args) {
		
		char reponse;
		DestinationFacade facade = new DestinationFacade(new DestinationMockDAO());

		System.out.println("Bienvenue sur notre Agence BoVoyage.\nBoVoyage est la premi�re agence par ligne de commande sur la console.");
		Scanner scanner = new Scanner(System.in);
		do {
		System.out.println("\n\nVeuillez entrer une destination � ajouter dans le Mock : ");
		
		
		String inputString = scanner.nextLine();
		String dest = inputString;
		System.out.println("Vous avez entr� : "+inputString+"\n\nEntrez une description pour "+inputString+":");
		String inputString2 = scanner.nextLine();
		String desc = inputString2;
		System.out.println("Vous avez entr� : "+ inputString2); 
		
		Destination d = new Destination(dest, desc);
		facade.create(d);
		
		do {
			System.out.println("Voulez vous cr�er une autre destination ? (O/N)");
			reponse = scanner.nextLine().charAt(0);
			//scanner.close();
		}while(reponse != 'N' && reponse != 'O');
		}while(reponse == 'O');
		System.out.println("Merci d'avoir utilis� notre console de voyage.\nA bient�t pour de nouvelles aventures formidables!!");
		scanner.close();
		
		
			
	}

}
