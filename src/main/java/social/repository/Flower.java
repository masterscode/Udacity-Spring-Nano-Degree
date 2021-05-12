package social.repository;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Generated;
import org.hibernate.annotations.Table;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
//@Table(name="")
public class Flower {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "name")
    String name;

    @Column()
    Double price;

}
