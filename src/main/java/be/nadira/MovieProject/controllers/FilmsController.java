package be.nadira.MovieProject.controllers;

import be.nadira.MovieProject.entities.Films;
import be.nadira.MovieProject.entities.Genres;
import be.nadira.MovieProject.services.interfaces.FilmsService;
import be.nadira.MovieProject.services.interfaces.GenresService;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.HttpSessionRequiredException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

@Controller
public class FilmsController {

    @Autowired
    private GenresService genresService;

    private final FilmsService filmsService;

    @Autowired
    public FilmsController(FilmsService filmsService) {
        this.filmsService = filmsService;
    }

    @GetMapping("/films")
    public String viewFilms(Model model) {
        List<Films> films = filmsService.findAll();
        model.addAttribute("films", films);
        return "films";
    }

    @GetMapping("/films/{genres}")
    public String seeAllFilmsByGenres(Model model, @PathVariable() int id) {
        Genres genres = genresService.findGenresById(id);
        List<Films> films = filmsService.findFilmsByGenres(genres);
        model.addAttribute("films", genresService.findGenresById(id));
        return "films";


    }
}