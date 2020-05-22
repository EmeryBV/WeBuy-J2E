package univ.tours.WeBuy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuy.entities.Ami;

@RepositoryRestResource
public interface AmiJpaRepository extends JpaRepository<Ami,Long>{

}
