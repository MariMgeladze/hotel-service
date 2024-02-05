package softlab.homework.hotel.service.service;

import softlab.homework.hotel.service.entity.Hotel;

import java.util.List;

public interface HotelService {
        List<Hotel> search(Integer hotelId, String name, String address);



        void getHotelData(Integer hotelId, String name, String description, String address, Boolean parking, Boolean wifi);


}
