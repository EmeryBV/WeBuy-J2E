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
public class Groupe implements Serializable {
	
	@Id
	@GeneratedValue
	private int idGroupe;
	private boolean visible;
	@ManyToOne(cascade = CascadeType.MERGE)
    @JoinColumn(name = "idPromotion")
	private Promotion promotion;
	@OneToMany(mappedBy = "groupe", fetch = FetchType.LAZY)
	public Collection<Invitation> invitations;
	@OneToMany(mappedBy = "groupe", fetch = FetchType.LAZY)
	public Collection<Message> messages;
	@OneToMany(mappedBy = "groupe", fetch = FetchType.LAZY)
	public Collection<Utilisateur_Groupe> utilisateur_groupes;
	
	public Groupe() {
		
	}
	
	public Groupe(boolean visible, Promotion promotion) {
		this.visible = visible;
		this.promotion = promotion;
	}

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
	
	public Promotion getPromotion() {
		return this.promotion;
	}
	
	public void setPromotion(Promotion promotion) {
		this.promotion = promotion;
	}

	public Collection<Invitation> getInvitations() {
		return invitations;
	}

	public void setInvitations(Collection<Invitation> invitations) {
		this.invitations = invitations;
	}

	public Collection<Message> getMessages() {
		return messages;
	}

	public void setMessages(Collection<Message> messages) {
		this.messages = messages;
	}

	public Collection<Utilisateur_Groupe> getUtilisateur_groupes() {
		return utilisateur_groupes;
	}

	public void setUtilisateur_groupes(Collection<Utilisateur_Groupe> utilisateur_groupes) {
		this.utilisateur_groupes = utilisateur_groupes;
	}

}