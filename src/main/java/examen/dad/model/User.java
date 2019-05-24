package examen.dad.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long id;

    private String name;
    private String password;
    private String state;

    @OneToOne
    private Rol rol;

    @OneToOne
    private Person person;
}
