package be.nadira.MovieProject.repositories;

import be.nadira.MovieProject.entities.Klanten;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KlantenRepository extends JpaRepository<Klanten, Integer> {
}
