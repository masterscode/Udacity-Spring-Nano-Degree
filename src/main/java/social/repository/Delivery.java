package social.repository;

import lombok.Data;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Type;
import org.springframework.data.annotation.Id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import java.time.LocalDateTime;

@Data
@Entity
public class Delivery {
    @javax.persistence.Id
    @GeneratedValue
    @Id
    private Long id;

    @Nationalized
    private String recipientName;

    @Column
    private String address;

    @Column
    private LocalDateTime deliveryTime;

    @Type(type="yes_no")
    private Boolean completed;

}
