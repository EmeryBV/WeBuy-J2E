package univ.tours.WeBuy.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Utilisateur implements Serializable {

	@Id
	@GeneratedValue
	private int idUtilisateur;
	private String prenom;
	private String nom;
	private String email;
	private String motDePasse;
	private String role;
	private int token;
	@OneToMany
	private Collection<Message> messages;
	@OneToMany
	private Collection<Invitation> invitations;
	@OneToMany
	private Collection<Ami> amis;
	@OneToMany
	private Collection<Utilisateur_Groupe> utilisateur_groupes;
	
	public Utilisateur() {
		
	}
	
	public Utilisateur(String prenom, String nom, String email, String motDePasse, String role, int token) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.role = role;
		this.token = token;
	}
	
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotDePasse() {
		return motDePasse;
	}
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getToken() {
		return token;
	}
	public void setToken(int token) {
		this.token = token;
	}

	public Collection<Message> getMessages() {
		return messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}

	public Collection<Invitation> getInvitations() {
		return invitations;
	}

	public void setInvitations(Collection<Invitation> invitations) {
		this.invitations = invitations;
	}

	public Collection<Ami> getAmis() {
		return amis;
	}

	public void setAmis(Collection<Ami> amis) {
		this.amis = amis;
	}

	public Collection<Utilisateur_Groupe> getUtilisateur_groupes() {
		return utilisateur_groupes;
	}

	public void setUtilisateur_groupes(Collection<Utilisateur_Groupe> utilisateur_groupes) {
		this.utilisateur_groupes = utilisateur_groupes;
	}
	
}
