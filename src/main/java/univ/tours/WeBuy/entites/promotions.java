package univ.tours.WeBuy.entites;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


@Entity
public class promotions implements Serializable {
	
	@Id
	@GeneratedValue
	private int idPromotions;
	private String description;
	private float prixAvecPromo;
	private int quantiteMin,quantiteMax,stock;
	private String duree;
	private int idProduit,idMagasin;
	
	@OneToMany(mappedBy = "groupe", fetch = FetchType.LAZY)
	@JoinColumn(name = "idPromotion")
	
	
	public int getIdPromotions() {
		return idPromotions;
	}
	public void setIdPromotions(int idPromotions) {
		this.idPromotions = idPromotions;
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
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public int getIdMagasin() {
		return idMagasin;
	}
	public void setIdMagasin(int idMagasin) {
		this.idMagasin = idMagasin;
	}
	
	
	

}
