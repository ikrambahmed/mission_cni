package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Fonction;
import application.model.FonctionPK;

@Repository
public interface FonctionRepository extends JpaRepository<Fonction, FonctionPK>{

}
