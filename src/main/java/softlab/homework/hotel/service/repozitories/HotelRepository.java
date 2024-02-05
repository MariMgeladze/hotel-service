package softlab.homework.hotel.service.repozitories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.homework.hotel.service.entity.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, Integer> {
}
