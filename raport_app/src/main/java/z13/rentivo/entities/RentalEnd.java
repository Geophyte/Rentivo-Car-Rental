package z13.rentivo.entities;


import javax.persistence.*;
import javax.validation.constraints.Min;

import java.util.Date;

import lombok.*;
import org.springframework.lang.Nullable;

@Data @Entity @NoArgsConstructor @AllArgsConstructor
@Table(name = "rental_end")
public class RentalEnd {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NonNull
    @Column(name = "end_id")
    private Long endId;

    @NonNull
    @Column(name = "end_time")
    private Date endTime;

    @Min(value = 0)
    @Column(name = "end_mileage")
    private Float endMileage;

//    @OneToOne(optional = false)
//    @JoinColumn(name = "rental_id", referencedColumnName = "rental_id")
//    private Rental rental;
}