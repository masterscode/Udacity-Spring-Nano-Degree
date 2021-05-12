package social.repository;

import lombok.Data;
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
    Long id;

    @Column
    String recipientName;

    @Column
    String address;

    @Column
    LocalDateTime deliveryTime;

}
