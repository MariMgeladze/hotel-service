package softlab.homework.hotel.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import softlab.homework.hotel.service.entity.Hotel;
import softlab.homework.hotel.service.entity.Room;
import softlab.homework.hotel.service.service.RoomService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class RoomController {
    private final RoomService roomService;


    @GetMapping("room")
    public List<Room> search(Integer roomNumber){
        return roomService.search(roomNumber);
    }

    @PostMapping("room")
    public void createRoom(@RequestBody Room data){
        roomService.createRoom(data);
}



}
