package univ.tours.WeBuy.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Message implements Serializable {

	@Id
	@GeneratedValue
	private int idMessage;
	private String contenu;
	private String date;
	//private int idUtilisateur;
	//private int idGroupe;
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idGroupe")
	private Groupe groupe;
	
	public Message() {
		
	}
	
	public Message(String contenu, String date, Utilisateur utilisateur, Groupe groupe) {
		super();
		this.contenu = contenu;
		this.date = date;
		this.utilisateur = utilisateur;
		this.groupe = groupe;
	}

	public int getIdMessage() {
		return idMessage;
	}
	
	public void setIdMessage(int idMessage) {
		this.idMessage = idMessage;
	}
	
	public String getContenu() {
		return contenu;
	}
	
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	
	public String getDate() {
		return date;
	}
	
	public void setDate(String date) {
		this.date = date;
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
