package univ.tours.WeBuy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuy.entities.Magasin;

@RepositoryRestResource
public interface MagasinJpaRepository extends JpaRepository<Magasin,Long> {

}
