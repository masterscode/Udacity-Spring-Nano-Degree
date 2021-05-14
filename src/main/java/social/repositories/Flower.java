package social.repository;

import lombok.Data;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.Nationalized;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.math.BigDecimal;

@Entity
@Data
//@Table(appliesTo = "plant") // only use when you want to map an entity to a different table name
public class Flower {
    @Id
    @GeneratedValue
    private Long id;

    @Nationalized
    private String name;

    @Column(precision = 12, scale = 4)
    private BigDecimal price;

    @OneToOne
    private social.repository.Delivery delivery;

}
