package fr.gtm.main;

import java.util.Scanner;

import fr.gtm.bovoyage.dao.DestinationMockDAO;
import fr.gtm.bovoyage.entities.Destination;
import fr.gtm.bovoyage.facade.DestinationFacade;

public class Main {
	/**
	 * Methode main du programme. Cette methode demande a l'utilisateur par
	 * l'intermediaire de la console de definir un nom de destination et une
	 * description puis ajoute la destination a la liste de destinations du MOCK.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		char reponse;
		DestinationFacade facade = new DestinationFacade(new DestinationMockDAO());

		System.out.println(
				"Bienvenue sur notre Agence BoVoyage.\nBoVoyage est la première agence par ligne de commande sur la console.");
		Scanner scanner = new Scanner(System.in);
		do { // Boucle principale
			System.out.println("\n\nVeuillez entrer une destination à ajouter dans le Mock : ");

			String inputString = scanner.nextLine();
			String dest = inputString;
			System.out.println(
					"Vous avez entré : " + inputString + "\n\nEntrez une description pour " + inputString + ":");
			String inputString2 = scanner.nextLine();
			String desc = inputString2;
			System.out.println("Vous avez entré : " + inputString2);

			Destination d = new Destination(dest, desc);
			facade.create(d);

			do { // On répète cette boucle tant que l'utilisateur n'a pas rentré une autre
					// destination.
				System.out.println("Voulez vous créer une autre destination ? (O/N)");
				reponse = scanner.nextLine().charAt(0);
				// scanner.close();
			} while (reponse != 'N' && reponse != 'O');
		} while (reponse == 'O');
		System.out.println(
				"Merci d'avoir utilisé notre console de voyage.\nA bientôt pour de nouvelles aventures formidables!!");
		scanner.close();

	}

}
