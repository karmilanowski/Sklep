package pl.motorola.sklep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.motorola.sklep.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


}
