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

		char reponse;																				//Déclaration d'une variable de type caractère.
		DestinationFacade facade = new DestinationFacade(new DestinationMockDAO());					//Instanciation d'une façade de type DestinationFacade

		System.out.println("Bienvenue sur notre Agence BoVoyage.\nBoVoyage est la première agence par ligne de commande sur la console.");	//Affichage du message de bienvenue.
		Scanner scanner = new Scanner(System.in);													//Création du scanner.
		do { // Boucle principale																	//Entrée dans la boucle do...while
			System.out.println("\n\nVeuillez entrer une destination à ajouter dans le Mock : ");	//Affichage qui demande d'entrer une nouvelle destination à rechercher.

			String inputString = scanner.nextLine();												//Déclaration d'une variable de type String qui contient la ligne entrée par l'utilisateur.
			String dest = inputString;																//Déclaration d'une variable de type String dans laquelle on transfert les informations entrées par l'utilisateur.
			System.out.println("Vous avez entré : " + inputString + "\n\nEntrez une description pour " + inputString + ":");	//Affichage qui confirme la destination entrée.
			String inputString2 = scanner.nextLine();												//Déclaration d'une variable de type String qui contient la ligne entrée par l'utilisateur.
			String desc = inputString2;																//Déclaration d'une variable de type String dans laquelle on transfert les informations entrées par l'utilisateur.
			System.out.println("Vous avez entré : " + inputString2);								//Affichage qui confirme la description entrée.

			Destination d = new Destination(dest, desc);											//Instanciation d'une destination d qui contient la destination et la description entrées par l'utilisateur.
			facade.create(d);																		//Création de la destination dans le Mock.
			System.out.println("");
			System.out.println(d + " a été créé");
			do { 																					//Boucle do...while : On répète cette boucle tant que l'utilisateur n'a pas rentré une autre destination.
				System.out.println("Voulez vous créer une autre destination ? (O/N)");				//Affichage qui demande à l'utilisateur s'il veut entrer une autre destination.
				reponse = scanner.nextLine().charAt(0);												//Instanciation de la variable qui va lire le caractère à la position 0, entrée par l'utilisateur.
				
			} while (reponse != 'N' && reponse != 'O');												//Tant que le premier caractère de l'input est différent de "N" et "O"
		} while (reponse == 'O');																	//Si la réponse est égale à "O", on re-boucle sur la boucle principale.
		System.out.println("Merci d'avoir utilisé notre console de voyage.\nA bientôt pour de nouvelles aventures formidables!!");	//Affichage du message de sortie.
		scanner.close();																			//Fermeture du scanner.

	}

}
