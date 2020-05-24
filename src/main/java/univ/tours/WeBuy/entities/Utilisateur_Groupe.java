package univ.tours.WeBuy.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
@IdClass(Utilisateur_GroupeID.class)
public class Utilisateur_Groupe {

	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	@Id
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idGroupe")
	private Groupe groupe;
	private int quantite;
	
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
	
	public int getQuantite() {
		return quantite;
	}
	
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
}
