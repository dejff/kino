package dawid.ginter.kino.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import dawid.ginter.kino.models.Seance;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
    public List<Seance> findByDeleted(Boolean deleted);
}