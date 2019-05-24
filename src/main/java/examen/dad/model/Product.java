package examen.dad.model;

import lombok.Data;

import javax.persistence.*;
@Entity
@Table(name = "products")
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "products_id")
    private Long id;

    private String name;
    private Double price;
    private int stock;
    private String code;
}
