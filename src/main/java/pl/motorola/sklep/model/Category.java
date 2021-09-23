package pl.motorola.sklep.model;

import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.UniqueElements;

import javax.persistence.*;
import java.util.List;

@Entity
@NoArgsConstructor
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @OneToMany(mappedBy = "category",cascade = {CascadeType.ALL})
    private List<Product> productList;


    public Category(String name) {
        this.name = name;

    }
}
