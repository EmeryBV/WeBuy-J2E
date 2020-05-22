package univ.tours.WeBuy.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Invitation implements Serializable {

	@Id
	@GeneratedValue
	private int idInvitation;
	//private int idEmetteur;
	private int idDestinataire;
	//private int idGroupe;
	@ManyToOne
	private Utilisateur emetteur;
	@ManyToOne
	private Groupe groupe;
	
	public Invitation() {
		
	}
	
	public Invitation(Utilisateur emetteur, int idDestinataire, Groupe groupe) {
		this.emetteur = emetteur;
		this.idDestinataire = idDestinataire;
		this.groupe = groupe;
	}

	public int getIdInvitation() {
		return idInvitation;
	}
	
	public void setIdInvitation(int idInvitation) {
		this.idInvitation = idInvitation;
	}

	public int getIdDestinataire() {
		return idDestinataire;
	}
	
	public void setIdDestinataire(int idDestinataire) {
		this.idDestinataire = idDestinataire;
	}

	public Utilisateur getEmetteur() {
		return emetteur;
	}

	public void setEmetteur(Utilisateur emetteur) {
		this.emetteur = emetteur;
	}

	public Groupe getGroupe() {
		return groupe;
	}

	public void setGroupe(Groupe groupe) {
		this.groupe = groupe;
	}
	
}
