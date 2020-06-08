package dawid.ginter.kino.service;

import java.util.List;

import org.springframework.stereotype.Service;

import dawid.ginter.kino.models.Reservation;
import dawid.ginter.kino.repository.ReservationRepository;

@Service
public class ReservationService {
    
    private ReservationRepository reservationRepository;

    public ReservationService(ReservationRepository reservationRepository) {
        this.reservationRepository = reservationRepository;
    }

    public List<Reservation> getAllReservations() {
        return reservationRepository.findAll();
    }

    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    public void deleteReservation(Long reservationId) throws IllegalArgumentException {
        reservationRepository.deleteById(reservationId);
    }
}