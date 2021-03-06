package pl.motorola.sklep.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.motorola.sklep.registration.AppUser;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<CartItem> cartItmes;
    @OneToOne
    private AppUser appUser;
}
