package be.nadira.MovieProject.services.interfaces;

import be.nadira.MovieProject.entities.Films;
import be.nadira.MovieProject.entities.Genres;


import java.util.List;

public interface FilmsService {

    List<Films> findAll();
    Films findById(int id);
    void save(Films films );
    void deleteById(int id);
    List<Films> findFilmsByGenres(Genres genres);
}
