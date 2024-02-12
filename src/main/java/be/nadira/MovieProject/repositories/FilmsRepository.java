package be.nadira.MovieProject.repositories;

import be.nadira.MovieProject.entities.Films;
import be.nadira.MovieProject.entities.Genres;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FilmsRepository extends JpaRepository<Films, Integer> {

    List<Films> findFilmsByGenres(Genres genres);

}
