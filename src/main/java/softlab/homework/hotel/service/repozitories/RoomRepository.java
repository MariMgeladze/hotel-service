package softlab.homework.hotel.service.repozitories;

import org.springframework.data.jpa.repository.JpaRepository;
import softlab.homework.hotel.service.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Integer> {
}
