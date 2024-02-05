package softlab.homework.hotel.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import softlab.homework.hotel.service.entity.Hotel;
import softlab.homework.hotel.service.service.HotelService;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HotelController {
    private final HotelService hotelService;

    @GetMapping("hotel")
   public List<Hotel> search( Integer hotelId,String name,String address){
       return hotelService.search(hotelId,name,address);
   }

    @PostMapping("update")
    public void updateHotel(@RequestBody Hotel hotel){
        hotelService.getHotelData(hotel.getHotelId(),hotel.getName(),hotel.getDescription(),hotel.getAddress(),hotel.getParking(),hotel.getWifi());


    }
}
