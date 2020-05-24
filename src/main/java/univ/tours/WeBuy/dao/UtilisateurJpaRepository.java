package univ.tours.WeBuy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuy.entities.Utilisateur;

@RepositoryRestResource
public interface UtilisateurJpaRepository extends JpaRepository<Utilisateur,Integer> {

}
