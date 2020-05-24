package univ.tours.WeBuy.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import univ.tours.WeBuy.entities.Message;

@RepositoryRestResource
public interface MessageJpaRepository extends JpaRepository<Message,Integer>{

}
