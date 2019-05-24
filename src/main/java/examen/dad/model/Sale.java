package examen.dad.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "sales")
@Data
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sales_id")
    private Long id;

    private Date date;

    @OneToOne
    private Person seller;

    @OneToOne
    private Person client;
}
