package softlab.homework.hotel.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.homework.hotel.service.entity.Room;
import softlab.homework.hotel.service.repozitories.RoomRepository;

import java.util.List;


@Service
@RequiredArgsConstructor
public class RoomServiceImpl implements RoomService {
    private final RoomRepository roomRepository;

    @Override
    public void createRoom(Room data) {
        Room room = new Room();
        room.setRoomNumber(data.getRoomNumber());
        room.setFloor(room.getFloor());
        room.setCategory(data.getCategory());
        room.setBedInfo(room.getBedInfo());
        room.setPrice(room.getPrice());
        roomRepository.save(data);

    }

    @Override
    public List<Room> search(Integer roomNumber) {
        return roomRepository.findAll();
    }
}
