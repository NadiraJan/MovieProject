package be.nadira.MovieProject.controllers;

import be.nadira.MovieProject.entities.Genres;
import be.nadira.MovieProject.services.interfaces.FilmsService;
import be.nadira.MovieProject.services.interfaces.GenresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;

@Controller
public class GenresController {

    @Autowired
    private FilmsService filmsService;

    private final GenresService genresService;
    @Autowired
    public GenresController(GenresService genresService) {
        this.genresService = genresService;
    }

    @GetMapping("/genres")
    public String viewHomePage(Model model){
        List<Genres> genres = genresService.findAll();
        model.addAttribute("genres", genres);
        return "genres";
    }


}
