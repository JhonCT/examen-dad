package examen.dad.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "details_sales")
@Data
public class Details_Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "details_sales_id")
    private Long id;

    private Double price;
    private int cantidad;

    @OneToOne
    private Sale sale;

    @OneToMany
    private List<Product> products;
}
