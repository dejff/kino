package dawid.ginter.kino.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import dawid.ginter.kino.models.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
}