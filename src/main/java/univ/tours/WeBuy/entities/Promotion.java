package univ.tours.WeBuy.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Promotion implements Serializable {
	
	@Id
	@GeneratedValue
	private int idPromotion;
	private String nom;
	private String description;
	private double prixAvecPromo;
	private int quantiteMin;
	private int quantiteMax;
	private int stock;
	private String duree;
	@OneToMany(mappedBy = "promotion", fetch = FetchType.LAZY)
	private Collection<Groupe> groupes;
	@ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "idProduit")
	private Produit produit;
	@ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "idMagasin")
	private Magasin magasin;
	
	
	
	public Promotion(String nom, String description, double prixAvecPromo, int quantiteMin, int quantiteMax, int stock, String duree,
			Produit produit, Magasin magasin) {
		this.nom = nom;
		this.description = description;
		this.prixAvecPromo = prixAvecPromo;
		this.quantiteMin = quantiteMin;
		this.quantiteMax = quantiteMax;
		this.stock = stock;
		this.duree = duree;
		this.produit = produit;
		this.magasin = magasin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getIdPromotion() {
		return idPromotion;
	}
	
	public void setIdPromotion(int idPromotions) {
		this.idPromotion = idPromotions;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public double getPrixAvecPromo() {
		return prixAvecPromo;
	}
	
	public void setPrixAvecPromo(double prixAvecPromo) {
		this.prixAvecPromo = prixAvecPromo;
	}
	
	public int getQuantiteMin() {
		return quantiteMin;
	}
	
	public void setQuantiteMin(int quantiteMin) {
		this.quantiteMin = quantiteMin;
	}
	
	public int getQuantiteMax() {
		return quantiteMax;
	}
	
	public void setQuantiteMax(int quantiteMax) {
		this.quantiteMax = quantiteMax;
	}
	
	public int getStock() {
		return stock;
	}
	
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	public String getDuree() {
		return duree;
	}
	
	public void setDuree(String duree) {
		this.duree = duree;
	}

	public Collection<Groupe> getGroupes() {
		return groupes;
	}

	public void setGroupes(Collection<Groupe> groupes) {
		this.groupes = groupes;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Magasin getMagasin() {
		return magasin;
	}

	public void setMagasin(Magasin magasin) {
		this.magasin = magasin;
	}
	
}