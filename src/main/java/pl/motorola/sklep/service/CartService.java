package pl.motorola.sklep.service;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import pl.motorola.sklep.model.Cart;
import pl.motorola.sklep.repository.CartRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CartService {
    private CartRepository cartRepository;

    public ResponseEntity<List<Cart>> findAll(){
        return new ResponseEntity<List<Cart>>(cartRepository.findAll(), HttpStatus.OK);
    }

    public ResponseEntity<Cart> findById(Long id){
        return new ResponseEntity<Cart>(cartRepository.getById(id),HttpStatus.OK);
    }

    public ResponseEntity<Cart> save(Cart cart){
        return new ResponseEntity<Cart>(cartRepository.save(cart), HttpStatus.CREATED);
    }
}
