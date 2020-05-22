package univ.tours.WeBuy.entities;

import java.io.Serializable;
import java.util.Objects;

public class Utilisateur_GroupeID implements Serializable {

	private Utilisateur utilisateur;
	private Groupe groupe;
	
	public Utilisateur_GroupeID() {
		
	}

	public Utilisateur_GroupeID(Utilisateur utilisateur, Groupe groupe) {
		this.utilisateur = utilisateur;
		this.groupe = groupe;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
}
