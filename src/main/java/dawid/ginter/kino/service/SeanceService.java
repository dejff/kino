package dawid.ginter.kino.service;

import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import dawid.ginter.kino.models.Seance;
import dawid.ginter.kino.repository.SeanceRepository;

@Service
public class SeanceService {
    
    private SeanceRepository seanceRepository;

    public SeanceService(SeanceRepository seanceRepository) {
        this.seanceRepository = seanceRepository;
    }

    public List<Seance> getAllSeances() {
        return seanceRepository.findByDeleted(false);
    }

    public Seance addSeance(Seance seance) {
        return seanceRepository.save(seance);
    }

    @Transactional
    public void deleteSeance(Long seanceId) throws EntityNotFoundException {
        Seance seanceToDelete = null;
        seanceToDelete = seanceRepository.getOne(seanceId);
        seanceToDelete.setDeleted(true);
        seanceRepository.save(seanceToDelete);
    }
}