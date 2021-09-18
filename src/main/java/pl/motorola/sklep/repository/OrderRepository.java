package pl.motorola.sklep.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.motorola.sklep.model.Order;
import pl.motorola.sklep.model.Product;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {


}
