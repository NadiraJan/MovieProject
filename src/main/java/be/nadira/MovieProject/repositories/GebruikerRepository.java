package be.nadira.MovieProject.repositories;

import be.nadira.MovieProject.entities.Gebruiker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GebruikerRepository extends JpaRepository<Gebruiker, Integer> {
}
