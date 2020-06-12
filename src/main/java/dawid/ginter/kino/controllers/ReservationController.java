package dawid.ginter.kino.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;

import dawid.ginter.kino.models.Reservation;
import dawid.ginter.kino.service.ReservationService;

@RestController
public class ReservationController {

    private ReservationService reservationService;

    public ReservationController(ReservationService reservationService) {
        this.reservationService = reservationService;
    }

    @GetMapping("/reservations")
    public List<Reservation> getAll() {
        return reservationService.getAllReservations();
    }

    @PostMapping("/reservations")
    public Reservation addReservation(@RequestBody Reservation reservation) {
        return reservationService.addReservation(reservation);
    }

    @DeleteMapping("/reservations/{reservationId}")
    public void deleteReservation(@PathVariable("reservationId") Long reservationId) {
        reservationService.deleteReservation(reservationId);
    }

}
