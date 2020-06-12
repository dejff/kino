package dawid.ginter.kino.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import dawid.ginter.kino.models.Movie;
import dawid.ginter.kino.service.MovieService;


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

    @CrossOrigin("localhost:4200/**")
    @DeleteMapping("/movies/{movieId}")
    public void deleteMovie(@PathVariable("movieId") Long movieId) {
        movieService.deleteMovie(movieId);
    }

}
