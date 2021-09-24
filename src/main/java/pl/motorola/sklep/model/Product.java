package pl.motorola.sklep.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private BigDecimal price;
    @Column(length = 2000)
    private String description;
    @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
    private Category category;
    private String image;
    private double rate;
    private int quantity;

    public Product(String title, BigDecimal price, String description, Category category, String image, double rate, int quantity) {
        this.title = title;
        this.price = price;
        this.description = description;
        this.category = category;
        this.image = image;
        this.rate = rate;
        this.quantity = quantity;
    }
}
