package univ.tours.WeBuy.entities;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Magasin implements Serializable {
	
	@Id
	@GeneratedValue
	private int idMagasin;
	private String nom;
	private String adresse;
	private String logo;
	private float latitude;
	private float longitude;
	@OneToMany
	private Collection<Promotion> promotions;

	public Magasin() {
		
	}

	public Magasin(String nom, String adresse, String logo, float latitude, float longitude) {
		this.nom = nom;
		this.adresse = adresse;
		this.logo = logo;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public int getIdMagasin() {
		return idMagasin;
	}

	public void setIdMagasin(int idMagasin) {
		this.idMagasin = idMagasin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	public Collection<Promotion> getPromotions() {
		return promotions;
	}

	public void setPromotions(Collection<Promotion> promotions) {
		this.promotions = promotions;
	}
	
}
