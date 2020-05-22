package univ.tours.WeBuy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuy.entities.Utilisateur_Groupe;

@RepositoryRestResource
public interface Utilisateur_GroupeJpaRepository extends JpaRepository<Utilisateur_Groupe,Long> {

}
