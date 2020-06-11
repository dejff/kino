package dawid.ginter.kino.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dawid.ginter.kino.models.Movie;
import dawid.ginter.kino.repository.MovieRepository;

@Service
public class MovieService {

    private MovieRepository movieRepository;

    public MovieService(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    public List<Movie> getAllMovies() {
        return movieRepository.findAllByDeletedFalse();
    }

    public Movie addMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Transactional
    public void deleteMovie(Long movieId) throws EntityNotFoundException{
            Movie movieToDelete = null;
            movieToDelete = movieRepository.getOne(movieId);
            movieToDelete.setDeleted(true);
            movieRepository.save(movieToDelete);
    }

}
