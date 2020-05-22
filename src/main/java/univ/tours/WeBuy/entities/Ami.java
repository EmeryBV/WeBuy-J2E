package univ.tours.WeBuy.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Ami implements Serializable {

	@Id
	@GeneratedValue
	private int idAmi;
	@ManyToOne
	private Utilisateur utilisateur1;
	private int utilisateur2;
	
	public Ami() {
		
	}

	public Ami(Utilisateur utilisateur1, int utilisateur2) {
		this.utilisateur1 = utilisateur1;
		this.utilisateur2 = utilisateur2;
	}

	public int getIdAmi() {
		return idAmi;
	}

	public void setIdAmi(int idAmi) {
		this.idAmi = idAmi;
	}

	public Utilisateur getUtilisateur1() {
		return utilisateur1;
	}

	public void setUtilisateur1(Utilisateur utilisateur1) {
		this.utilisateur1 = utilisateur1;
	}

	public int getUtilisateur2() {
		return utilisateur2;
	}

	public void setUtilisateur2(int utilisateur2) {
		this.utilisateur2 = utilisateur2;
	}
	
}
