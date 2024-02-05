package softlab.homework.hotel.service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(schema = "public", name = "hotel")

public class Hotel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hotel_seq_generator")
    @SequenceGenerator(name = "hotel_seq_generator",sequenceName = "hotel_hotel_id_seq", allocationSize = 1)

    @Column(name = "hotel_id")
    private Integer hotelId;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "address")
    private String address;

    @Column(name = "parking")
    private Boolean parking;

    @Column(name = "wifi")
    private Boolean wifi;





}
