package univ.tours.WeBuy.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Promotion implements Serializable {
	
	@Id
	@GeneratedValue
	private int idPromotion;
	private String description;
	private float prixAvecPromo;
	private int quantiteMin;
	private int quantiteMax;
	private int stock;
	private String duree;
	@OneToMany
	private Collection<Groupe> groupes;
	@ManyToOne
	private Produit produit;
	@ManyToOne
	private Magasin magasin;
	
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
	
	public float getPrixAvecPromo() {
		return prixAvecPromo;
	}
	
	public void setPrixAvecPromo(float prixAvecPromo) {
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