package be.nadira.MovieProject.services.implementations;

import be.nadira.MovieProject.entities.Genres;
import be.nadira.MovieProject.repositories.GenresRepository;
import be.nadira.MovieProject.services.interfaces.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenresServiceImpl implements GenresService {

    private final GenresRepository genresRepository;

    @Autowired
    public GenresServiceImpl(GenresRepository genresRepository) {
        this.genresRepository = genresRepository;
    }


    @Override
    public List<Genres> findAll() {
        return genresRepository.findAll();
    }

    @Override
    public void save(Genres genres) {
        genresRepository.save(genres);

    }

    @Override
    public Genres findGenresById(int id) {
        return genresRepository.findById(id).get();
    }


    @Override
    public void deleteById(int id) {
        genresRepository.deleteById(id);

    }
}
