package univ.tours.WeBuy.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import univ.tours.WeBuy.dao.*;
import univ.tours.WeBuy.entities.Groupe;
import univ.tours.WeBuy.entities.Magasin;
import univ.tours.WeBuy.entities.Produit;
import univ.tours.WeBuy.entities.Promotion;

@Service
@Transactional
public class InitWebuyImpl implements InitWebuy {

	@Autowired
	ProduitJpaRepository produitRep;
	@Autowired
	GroupeJpaRepository groupeRep;
	@Autowired
	MagasinJpaRepository magasinRep;
	@Autowired
	PromotionJpaRepository promotionRep;
	
	InitWebuyDatas datas = new InitWebuyDatas();
	
	@Override
	public void initAmis() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initGroupes() {
		ArrayList<Groupe> gList = datas.getGroupesList();
		for (Groupe g: gList) {
			groupeRep.save(g);
		}
	}

	@Override
	public void initInvitatiins() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initMagasins() {
		ArrayList<Magasin> mList = datas.getMagasinsList();
		for (Magasin m: mList) {
			magasinRep.save(m);
		}
	}

	@Override
	public void initMessages() {
		// TODO Auto-generated method stub
	}

	@Override
	public void initProduits() {
		ArrayList<Produit> pList = datas.getProduitsList();
		for (Produit p: pList) {
			produitRep.save(p);
		}
	}

	@Override
	public void initPromotions() {
		ArrayList<Promotion> pList = datas.getPromotionsList();
		for (Promotion p: pList) {
			promotionRep.save(p);
		}		
	}

	@Override
	public void initUtilisateursGroupes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void initUtilisateur() {
		// TODO Auto-generated method stub
		
	}

}
