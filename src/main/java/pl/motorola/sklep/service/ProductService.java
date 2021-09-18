package pl.motorola.sklep.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.motorola.sklep.model.Product;
import pl.motorola.sklep.repository.ProductRepository;


@Service
@AllArgsConstructor
public class ProductService {

    private final ProductRepository productRepository;

    public Product findById(long id){
        return productRepository.findById(id);
    }

    public void save(Product product){
        productRepository.save(product);
    }
}
