package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import application.model.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, String> {

}
