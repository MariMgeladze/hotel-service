package softlab.homework.hotel.service.service;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import softlab.homework.hotel.service.entity.Hotel;
import softlab.homework.hotel.service.repozitories.HotelRepository;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class HotelServiceImpl implements HotelService {

    private final HotelRepository hotelRepository;


      @Override
    public List<Hotel> search(Integer hotelId, String name, String address) {
        return hotelRepository.findAll();
    }

    @Override
    public void getHotelData(Integer hotelId, String name, String description, String address, Boolean parking, Boolean wifi) {

            Optional<Hotel> hotel=hotelRepository.findById(hotelId);
            hotel.get().setName(name);
            hotel.get().setDescription(description);
            hotel.get().setAddress(address);
            hotel.get().setParking(parking);
            hotel.get().setWifi(wifi);
            hotelRepository.save(hotel.get());

                }

}
