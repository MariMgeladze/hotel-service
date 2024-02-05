package softlab.homework.hotel.service.service;

import softlab.homework.hotel.service.entity.Room;
import softlab.homework.hotel.service.models.AddRoom;

import java.util.List;

public interface RoomService {

    void createRoom(Room data);

    List<Room> search(Integer roomNumber);
}
