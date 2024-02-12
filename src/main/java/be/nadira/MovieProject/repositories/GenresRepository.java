package be.nadira.MovieProject.repositories;

import be.nadira.MovieProject.entities.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GenresRepository extends JpaRepository <Genres, Integer>{
}
