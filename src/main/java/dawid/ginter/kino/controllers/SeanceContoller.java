package dawid.ginter.kino.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dawid.ginter.kino.models.Seance;
import dawid.ginter.kino.service.SeanceService;

@RestController
public class SeanceContoller {
    
    private SeanceService seanceService;

    public SeanceContoller(SeanceService seanceService) {
        this.seanceService = seanceService;
    }

    @GetMapping("/seances")
    public List<Seance> getAll() {
        return seanceService.getAllSeances();
    }

    @PostMapping("/seances")
    public Seance addSeance(@RequestBody Seance seance) {
        return seanceService.addSeance(seance);
    }

    @DeleteMapping("/seances/{seanceId}")
    public void deleteSeance(@RequestParam("seanceId") Long seanceId) {
        seanceService.deleteSeance(seanceId);
    }

}