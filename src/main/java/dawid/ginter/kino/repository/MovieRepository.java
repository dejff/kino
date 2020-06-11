package dawid.ginter.kino.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import dawid.ginter.kino.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
    
    List<Movie> findAllByDeletedFalse();
    
}
