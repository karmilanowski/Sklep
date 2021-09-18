package pl.motorola.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.motorola.sklep.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Long> {
}
