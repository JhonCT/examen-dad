package examen.dad.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "persons")
@Data
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    private Long id;

    private String name;
    private String lastname;
    private String dni;
    private String phonenumber;
}
