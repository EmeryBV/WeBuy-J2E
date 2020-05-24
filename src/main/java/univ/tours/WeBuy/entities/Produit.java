package univ.tours.WeBuy.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Produit implements Serializable {
	
	@Id
	@GeneratedValue
	private int idProduit;
	private String nom;
	private String logo;
	private double prix;
	@OneToMany(mappedBy = "produit", fetch = FetchType.LAZY)
	private Collection<Promotion> promotions;
	
	public Produit() {
		
	}

	public Produit(String nom, String logo, double prix) {
		this.nom = nom;
		this.logo = logo;
		this.prix = prix;
	}

	public int getIdProduit() {
		return idProduit;
	}

	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public double getPrix() {
		return prix;
	}
	
	public void setPrix(double prix) {
		this.prix = prix;
	}
	
	public Collection<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(Collection<Promotion> promotions) {
		this.promotions = promotions;
	}
}
