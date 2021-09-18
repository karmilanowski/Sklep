package pl.motorola.sklep.service;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.motorola.sklep.model.Order;
import pl.motorola.sklep.repository.OrderRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class OrderService {

    private OrderRepository orderRepository;

    ResponseEntity<List<Order>> findAll(){
        return new ResponseEntity<List<Order>>(orderRepository.findAll(),HttpStatus.OK);
    }

    ResponseEntity<Order> findById(Long id){
        return new ResponseEntity<Order>(orderRepository.getById(id),HttpStatus.OK);
    }
}
