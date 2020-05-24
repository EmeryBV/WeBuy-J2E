package univ.tours.WeBuy.service;

import java.util.ArrayList;

import univ.tours.WeBuy.entities.Groupe;
import univ.tours.WeBuy.entities.Magasin;
import univ.tours.WeBuy.entities.Produit;
import univ.tours.WeBuy.entities.Promotion;

public class InitWebuyDatas {
	
	ArrayList<Magasin> magasins = new ArrayList<Magasin>();
	ArrayList<Promotion> promotions = new ArrayList<Promotion>();
	ArrayList<Produit> produits = new ArrayList<Produit>();
	ArrayList<Groupe> groupes = new ArrayList<Groupe>();
	
	// Magasins //
	
	Magasin m1;
	Magasin m2;
	Magasin m3;
	Magasin m4;
	Magasin m5;
	Magasin m6;
	Magasin m7;
	
	// Produits //
	
	Produit p1;
	Produit p2;
	Produit p3;
	Produit p4;
	Produit p5;
	Produit p6;
	Produit p7;
	Produit p8;
	Produit p9;
	Produit p10;
	Produit p11;
	Produit p12;
	Produit p13;
	Produit p14;
	Produit p15;
	Produit p16;
	Produit p17;
	Produit p18;
	
	// Promotions //
	
	Promotion pr1;
	Promotion pr2;
	Promotion pr3;
	Promotion pr4;
	Promotion pr5;
	Promotion pr6;
	Promotion pr7;
	Promotion pr8;
	Promotion pr9;
	Promotion pr10;
	Promotion pr11;
	Promotion pr12;
	Promotion pr13;
	Promotion pr14;
	Promotion pr15;
	Promotion pr16;
	Promotion pr17;
	Promotion pr18;
	
	// Groupes //
	
	Groupe g1;
	Groupe g2;
	Groupe g3;
	Groupe g4;
	Groupe g5;
	Groupe g6;
	Groupe g7;
	Groupe g8;
	Groupe g9;
	Groupe g10;
	Groupe g11;
	Groupe g12;
	Groupe g13;
	Groupe g14;
	Groupe g15;
	Groupe g16;
	Groupe g17;
	Groupe g18;
	Groupe g19;
	Groupe g20;
	
	protected ArrayList<Magasin> getMagasinsList() {
		
		m1 = new Magasin("Carrefour","Centre Commercial Les Atlantes, Avenue Jacques Duclos, 37700 Saint-Pierre-des-Corps",
				"https://www.cc-carrefour-venissieux.com/wp-content/uploads/sites/54/2016/11/file.jpg",
				47.381317,0.714275);
        m2 = new Magasin("Monoprix","63-65 Rue Nationale, 37000 Tours",
        		"https://www.macommune.info/wp-content/uploads/2018/10/monoprix-logo-940x600.jpg",
        		47.392393,0.689963);
        m3 = new Magasin("Leclerc","Rue de la Bondonnière, 37300 Joué-lès-Tours",
        		"https://upload.wikimedia.org/wikipedia/commons/thumb/e/ed/Logo_E.Leclerc_Sans_le_texte.svg/1200px-Logo_E.Leclerc_Sans_le_texte.svg.png",
        		47.330246,0.704540);
        m4 = new Magasin("Bricorama","Aushopping Blois Vineuil, zone industrielle, Le Haut des Sablons, 41350 Vineuil",
        		"https://static-pepper.dealabs.com/threads/thread_large/default/1896098_2.jpg",
        		47.574885,1.370801);
        m5 = new Magasin("La Halle","Zone Commerciale Auchan, 37100 Tours",
        		"https://static-pepper.dealabs.com/threads/thread_large/default/1890225_1.jpg",
        		47.427029,0.704141);
        m6 = new Magasin("Darty","11 Rue Philippe Maupas, 37170 Chambray-lès-Tours",
        		"https://static-pepper.dealabs.com/merchants/avatar_web_square_94/avatar/2_3.jpg",
        		47.336979,0.700475);
        m7 = new Magasin("Auchan","Centre Commercial la Vrillonnerie, Rue de Joué BP 239, 37170 Chambray-lès-Tours",
        		"https://res.cloudinary.com/westfielddg/image/upload/westfield-media/fr/retailer/logos/xvotuvkhefu3tozayn8r.png",
        		47.339242,0.699329);
        
        magasins.add(m1);
        magasins.add(m2);
        magasins.add(m3);
        magasins.add(m4);
        magasins.add(m5);
        magasins.add(m6);
        magasins.add(m7);
        
		return magasins;
	}
	
	protected ArrayList<Promotion> getPromotionsList() {
		//String nom, String description, float prixAvecPromo, int quantiteMin, int quantiteMax, int stock, String duree,
		//Produit produit, Magasin magasin
		
		pr1 = new Promotion("Lot de 5 Ketchup Heinz 900g","Description 1",1.59,5,5,120,"5 jours",p1,m1);
		pr2 = new Promotion("Nutella 1kg -50%","Description 2",2.50,2,2,100,"9 jours",p2,m1);
		pr3 = new Promotion("Lessive Skip 15 capsules 2+1 offert","Description 3",12.98,2,5,80,"30 jours",p3,m1);
		pr4 = new Promotion("Tropicana pur jus orange avec pulpe 1.5L 2 achetés le 3e à -50%","Description 4",5.97,2,2,350,"14 jours",p4,m2);
		pr5 = new Promotion("x2 Gel douche Le Petit Marseillais 250ml","Description 5",3.79,2,4,50,"7 jours",p5,m3);
		pr6 = new Promotion("Lot x3 Chocolat Milka Orea 100g","Description 6",4.99,3,6,90,"7 jours",p6,m3);
		pr7 = new Promotion("x3 Thé Arizona 50cl","Description 7",2.69,3,10,90,"30 jours",p7,m3);
		pr8 = new Promotion("Lot x10 Kinder Bueno 3+1","Description 8",16.77,4,12,100,"7 jours",p8,m7);
		pr9 = new Promotion("Pot Magnum Almond 300g -20% sur le 2","Description 9",3.99,2,10,110,"30 jours",p9,m2);
		pr10 = new Promotion("TV Panasonic TX-58GX800E - 4K Led","Description 10",599.99,3,3,18,"7 jours",p10,m6);
		pr11 = new Promotion("x3 Robot pâtissier Beko KMD3102W","Description 11",599.99,3,3,50,"14 jours",p11,m6);
		pr12 = new Promotion("x2 Robot tondeuse Worx WG797E.1","Description 12",1999.90,2,2,10,"30 jours",p12,m4);
		pr13 = new Promotion("Lasure longue durée Powerfix 5L 4+1 gratuit","Description 13",36,5,10,60,"14 jours",p13,m4);
		pr14 = new Promotion("x5 Polo manches courtes","Description 14",35.98,5,15,150,"20 jours",p14,m5);
		pr15 = new Promotion("Nike Air force 1 3 paires achetées la 4e à -75%","Description 15",325,3,3,40,"7 jours",p15,m5);
		pr16 = new Promotion("x3 Pantalon jogging","Description 16",100,3,6,60,"30 jours",p16,m5);
		pr17 = new Promotion("Café Bio Segafredo 500g 2+1 gratuit","Description 17",9.80,3,3,70,"3 jours",p17,m2);
		pr18 = new Promotion("x10 Lu Petit Ecolier","Description 18",5.99,10,10,200,"4 jours",p18,m2);
		
		promotions.add(pr1);
		promotions.add(pr2);
		promotions.add(pr3);
		promotions.add(pr4);
		promotions.add(pr5);
		promotions.add(pr6);
		promotions.add(pr7);
		promotions.add(pr8);
		promotions.add(pr9);
		promotions.add(pr10);
		promotions.add(pr11);
		promotions.add(pr12);
		promotions.add(pr13);
		promotions.add(pr14);
		promotions.add(pr15);
		promotions.add(pr16);
		promotions.add(pr17);
		promotions.add(pr18);
		
		return promotions;
	}
	
	protected ArrayList<Produit> getProduitsList() {

		p1 = new Produit("Ketchup Heinz 900g","https://static-pepper.dealabs.com/threads/thread_large/default/1896032_2.jpg",2.99);
		p2 = new Produit("Nutella 1kg","https://static-pepper.dealabs.com/threads/thread_large/default/1864749_2.jpg",4.99);
		p3 = new Produit("Lessive Skip 15 capsules","https://static-pepper.dealabs.com/threads/thread_large/default/1895681_1.jpg",6.99);
		p4 = new Produit("Tropicana pur jus orange avec pulpe 1.5L","https://static-pepper.dealabs.com/threads/thread_large/default/1398373_2.jpg",1.99);
		p5 = new Produit("Gel douche Le Petit Marseillais 250ml","https://static-pepper.dealabs.com/threads/thread_large/default/1894602_2.jpg",2.79);
		p6 = new Produit("Lot x3 Chocolat Milka Oreo 100g","https://static-pepper.dealabs.com/threads/thread_large/default/1894462_1.jpg",6.39);
		p7 = new Produit("Thé Arizona 50cl","https://static-pepper.dealabs.com/threads/thread_large/default/1894139_1.jpg",0.99);
		p8 = new Produit("Lot x10 Kinder Bueno","https://static-pepper.dealabs.com/threads/thread_large/default/1893383_1.jpg",5.59);
		p9 = new Produit("Pot Magnum Almond 300g","https://static-pepper.dealabs.com/threads/thread_large/default/1631175_1.jpg",4.99);
		p10 = new Produit("TV Panasonic TX-58GX800E - 4K Led","https://static-pepper.dealabs.com/threads/thread_large/default/1896199_2.jpg",799.90);
		p11 = new Produit("Robot pâtissier Beko KMD3102W","https://static-pepper.dealabs.com/threads/thread_large/default/1895851_1.jpg",249.99);
		p12 = new Produit("Robot tondeuse Worx WG797E.1","https://static-pepper.dealabs.com/threads/thread_large/default/1895895_1.jpg",1499.99);
		p13 = new Produit("Lasure longue durée Powerfix 5L","https://static-pepper.dealabs.com/threads/thread_large/default/1894991_1.jpg",9);
		p14 = new Produit("Polo manches courtes","https://static-pepper.dealabs.com/threads/thread_large/default/1646955_1.jpg",9.90);
		p15 = new Produit("Nike Air force 1","https://static-pepper.dealabs.com/threads/thread_large/default/1268379_1.jpg",99.80);
		p16 = new Produit("Pantalon jogging","https://static-pepper.dealabs.com/threads/thread_large/default/1821565_1.jpg",39.90);
		p17 = new Produit("Café Bio Segafredo 500g","https://static-pepper.dealabs.com/threads/thread_large/default/1888409_1.jpg",4.90);
		p18 = new Produit("Lu Petit Ecolier","https://static-pepper.dealabs.com/threads/thread_large/default/1778925_1.jpg",0.90);
		
		produits.add(p1);
		produits.add(p2);
		produits.add(p3);
		produits.add(p4);
		produits.add(p5);
		produits.add(p6);
		produits.add(p7);
		produits.add(p8);
		produits.add(p9);
		produits.add(p10);
		produits.add(p11);
		produits.add(p12);
		produits.add(p13);
		produits.add(p14);
		produits.add(p15);
		produits.add(p16);
		produits.add(p17);
		produits.add(p18);
		
		return produits;
	}
	
	protected ArrayList<Groupe> getGroupesList() {
		
		g1 = new Groupe(false,pr1);
		g2 = new Groupe(true,pr2);
		g3 = new Groupe(true,pr2);
		g4 = new Groupe(true,pr15);
		g5 = new Groupe(true,pr15);
		g6 = new Groupe(true,pr6);
		g7 = new Groupe(true,pr6);
		g8 = new Groupe(true,pr6);
		g9 = new Groupe(true,pr1);
		g10 = new Groupe(true,pr12);
		g11 = new Groupe(false,pr12);
		g12 = new Groupe(true,pr1);
		g13 = new Groupe(true,pr1);
		g14 = new Groupe(true,pr11);
		g15 = new Groupe(false,pr10);
		g16 = new Groupe(true,pr3);
		g17 = new Groupe(true,pr15);
		g18 = new Groupe(true,pr8);
		g19 = new Groupe(true,pr8);
		g20 = new Groupe(false,pr3);
		
		groupes.add(g1);
		groupes.add(g2);
		groupes.add(g3);
		groupes.add(g4);
		groupes.add(g5);
		groupes.add(g6);
		groupes.add(g7);
		groupes.add(g8);
		groupes.add(g9);
		groupes.add(g10);
		groupes.add(g11);
		groupes.add(g12);
		groupes.add(g13);
		groupes.add(g14);
		groupes.add(g15);
		groupes.add(g16);
		groupes.add(g17);
		groupes.add(g18);
		groupes.add(g19);
		groupes.add(g20);
		
		return groupes;
	}
	
}
