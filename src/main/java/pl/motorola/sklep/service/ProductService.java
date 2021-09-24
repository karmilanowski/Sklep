package pl.motorola.sklep.service;

import lombok.AllArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import pl.motorola.sklep.httpclient.ProductsMapper;
import pl.motorola.sklep.httpclient.client.ProductHttpClient;
import pl.motorola.sklep.httpclient.dto.ProductDto;
import pl.motorola.sklep.model.Product;
import pl.motorola.sklep.repository.ProductRepository;

import java.util.List;
import java.util.Optional;


@Service
@AllArgsConstructor
public class ProductService {

    private ProductHttpClient productHttpClient;
    private ProductsMapper productsMapper;

    private final ProductRepository productRepository;

    public Optional<Product> findById(long id){
        return productRepository.findById(id);
    }

    public void save(Product product){
        productRepository.save(product);
    }

    @EventListener(ApplicationReadyEvent.class)
    public void saveProducts(){
        List<ProductDto> products = productHttpClient.getProducts();
        List<Product> productList = productsMapper.toEntity(products);
        productRepository.saveAll(productList);
    }
}
