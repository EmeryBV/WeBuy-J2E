package univ.tours.WeBuy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import univ.tours.WeBuy.service.InitWebuy;
import univ.tours.WeBuy.service.InitWebuyImpl;

@SpringBootApplication
public class WeBuyApplication implements CommandLineRunner {

	@Autowired
	InitWebuy initWebuy;
	
	@Autowired
	public static void main(String[] args) {
		SpringApplication.run(WeBuyApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		initWebuy.initMagasins();
		initWebuy.initProduits();
		initWebuy.initPromotions();
		initWebuy.initGroupes();
	}

}
