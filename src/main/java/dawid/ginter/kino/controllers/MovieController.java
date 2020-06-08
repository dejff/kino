package dawid.ginter.kino.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import dawid.ginter.kino.models.Movie;
import dawid.ginter.kino.service.MovieService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MovieController {

    private MovieService movieService;

    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @GetMapping("/movies")
    public List<Movie> getAll() {
        return movieService.getAllMovies();
    }

    @PostMapping("/movies")
    public Movie postMethodName(@RequestBody Movie movie) {
        return movieService.addMovie(movie);
    }
    
    @GetMapping("/movies/delete/{movieId}")
    public void deleteMovie(@RequestParam("movieId") Long movieId) {
        movieService.deleteMovie(movieId);
    }

}