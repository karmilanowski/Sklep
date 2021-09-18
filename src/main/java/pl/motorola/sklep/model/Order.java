package pl.motorola.sklep.model;

import pl.motorola.sklep.registration.AppUser;

import javax.persistence.*;
import java.util.List;

@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<Product> productList;
    @OneToOne
    private AppUser appUser;
}
