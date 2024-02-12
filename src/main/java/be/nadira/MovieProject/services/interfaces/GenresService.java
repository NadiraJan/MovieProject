package be.nadira.MovieProject.services.interfaces;

import be.nadira.MovieProject.entities.Genres;

import java.util.List;

public interface GenresService {

    List<Genres> findAll();
    void save(Genres genres);
    Genres findGenresById(int id);
    void deleteById(int id);

}
