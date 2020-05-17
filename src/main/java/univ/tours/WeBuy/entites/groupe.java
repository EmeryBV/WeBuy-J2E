package univ.tours.WeBuy.entites;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class groupe implements Serializable {
	
	@Id
	@GeneratedValue
	private int idGroupe ;
	private boolean visible;
	private int idPromotion;
	@OneToOne(mappedBy= "promotions",fetch = FetchType.LAZY)
	@JoinColumn(name = "idPromotion")

	
	
	public int getIdGroupe() {
		return idGroupe;
	}
	public void setIdGroupe(int idGroupe) {
		this.idGroupe = idGroupe;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public int getIdPromotion() {
		return idPromotion;
	}
	public void setIdPromotion(int idPromotion) {
		this.idPromotion = idPromotion;
	}

}
