package univ.tours.WeBuy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuy.entities.Produit;

@RepositoryRestResource
public interface ProduitJpaRepository extends JpaRepository<Produit,Long> {

}
