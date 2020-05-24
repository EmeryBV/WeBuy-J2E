package univ.tours.WeBuy.entities;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ami implements Serializable {

	@Id
	@GeneratedValue
	private int idAmi;
	
	@ManyToOne(cascade = CascadeType.PERSIST)
    @JoinColumn(name = "idUtilisateur")
	private Utilisateur utilisateur;
	private int utilisateur2;
	
	public Ami() {
		
	}

	public Ami(Utilisateur utilisateur, int utilisateur2) {
		this.utilisateur = utilisateur;
		this.utilisateur2 = utilisateur2;
	}

	public int getIdAmi() {
		return idAmi;
	}

	public void setIdAmi(int idAmi) {
		this.idAmi = idAmi;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public int getUtilisateur2() {
		return utilisateur2;
	}

	public void setUtilisateur2(int utilisateur2) {
		this.utilisateur2 = utilisateur2;
	}
	
}
