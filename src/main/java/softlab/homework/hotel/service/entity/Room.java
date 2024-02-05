package softlab.homework.hotel.service.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(schema = "public", name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "room_seq_generator")
    @SequenceGenerator(name = "room_seq_generator",sequenceName = "room_room_id_seq", allocationSize = 1)

    @Column(name = "room_id")
    private Integer roomId;

    @Column(name = "room_number")
    private Integer roomNumber;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "category")
    private String category;

    @Column(name = "bed_info")
    private String bedInfo;

    @Column(name = "price")
    private Integer price;
}
