package be.nadira.MovieProject.services.implementations;

import be.nadira.MovieProject.entities.Films;
import be.nadira.MovieProject.entities.Genres;
import be.nadira.MovieProject.repositories.FilmsRepository;
import be.nadira.MovieProject.repositories.GenresRepository;
import be.nadira.MovieProject.services.interfaces.FilmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FilmsServiceImpl implements FilmsService {

    private final FilmsRepository filmsRepository;

    @Autowired
    public FilmsServiceImpl(FilmsRepository filmsRepository) {
        this.filmsRepository = filmsRepository;

    }

    @Autowired
    private GenresRepository genresRepository;

    @Override
    public List<Films> findAll() {
        return filmsRepository.findAll();
    }

    @Override
    public Films findById(int id) {
        return filmsRepository.findById(id).get();
    }

    @Override
    public void save(Films films) {
        filmsRepository.save(films);

    }

    @Override
    public void deleteById(int id) {
        filmsRepository.deleteById(id);

    }

    @Override
    public List<Films> findFilmsByGenres(Genres genres) {
        return filmsRepository.findFilmsByGenres(genres);
    }


}
