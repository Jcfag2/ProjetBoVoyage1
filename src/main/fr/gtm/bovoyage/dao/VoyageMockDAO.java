package fr.gtm.bovoyage.dao;

import java.util.ArrayList;
import java.util.List;

import fr.gtm.bovoyage.entities.Voyage;

/** 
 * 
 * @author JC et Zainab 
 * @version 1.0
 * 
 */

/**
 * Methode qui permet de creer un voyage dans le Mock.
 */

public class VoyageMockDAO implements VoyageDAO {

	
	// Creation d'une liste de voyages
	private List<Voyage> voyages = new ArrayList<Voyage>();


	//Simulation du compteur. Modificateur static car s'il existe plusieurs
	//VoyageDAO instancies, il leur faudra le meme compteur !!
	public static long idCpt = 0;

	/**
	 * Methode creer : sert a creer un voyage en lui attribuant un identifiant, puis
	 * incrementation du compteur pour ajouter le voyage cree, a la liste de
	 * voyages.
	 * 
	 * @param v : Le parametre v correspond a l'objet voyage correspondant a la
	 *          destination recherchee @see Voyage
	 * 
	 */
	@Override
	public void create(Voyage v) {
		v.setId(++idCpt); //Attribut d'un numéro id unique puis incrémentation de l'id
		voyages.add(v); // Ajoute le Voyage v à la liste des voyages. 
	}

	/**
	 * Methode supprimer : sert a supprimer un voyage de la liste en supprimant son
	 * identifiant.
	 * 
	 * @param v : Le parametre v correspond a l'objet voyage correspondant a la
	 *          destination recherchee @see Voyage
	 * 
	 */
	@Override
	public void delete(Voyage v) {
		voyages.remove(v); //Suppression du Voyage v de la liste des voyages.
		v.setId(0); // mise à 0 de l'id du voyage v.
	}

	/**
	 * Methode de mise a jour : sert a mettre a jour un voyage de la liste en lui
	 * attribuant un nouvel identifiant.
	 * 
	 * @param v : Le parametre v correspond a l'objet voyage correspondant a la
	 *          destination recherchee @see Voyage
	 * 
	 */
	@Override
	public void update(Voyage v) {
		for (Voyage voyage : voyages) { //boucle for each sur chaque voyage de la liste voyages
			if (voyage.getId() == v.getId()) //si l'id du voyage dans le MOCK correspond à l'id du voyage que l'on souhaite modifier
				voyage.setRegion(v.getRegion()); //MàJ de la région
				voyage.setDescriptif(v.getDescriptif()); //MàJ du descriptif
				voyage.setDate(v.getDate()); //MàJ de la date
				voyage.setClient(v.getClient()); //MàJ du client
				voyage.setVoyageurs(v.getVoyageurs()); //MàJ des voyageurs

			{

			}
		}
	}

	/**
	 * Methode : sert a recuperer un voyage a partir de son identifiant.
	 * 
	 * @param id : Le parametre id definit l'identifiant du voyage correspondant a
	 *           la destination recherchee @see Voyage
	 * @return Voyage : Retourne un objet Voyage qui correspond a l'id qui est en
	 *         parametre. Ou ne retourne aucun voyage si l'id ne correspond pas.
	 */

	@Override
	public Voyage getVoyageById(long id) {
		for (Voyage voyage : voyages) { //Boucle for each sur chaques voyages
			if (voyage.getId() == id) //Si l'id du voyage dans le MOCK correspond à l'id du voyage recherché
				return voyage; //retour du voyage correspond à l'id
		}
		return null;
//
	}
}
