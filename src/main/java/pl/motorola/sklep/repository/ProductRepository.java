package pl.motorola.sklep.repository;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pl.motorola.sklep.model.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Repository
@NoArgsConstructor
public class ProductRepository {

    private List<Product> productList = Arrays.asList(
            new Product("Mydło", "Pieniące", new BigDecimal("25.00")),
            new Product("Masło", "Się roztrzasło", new BigDecimal("99.99")),
            new Product("Chleb", "Razowy", new BigDecimal("5.50")));


    public List<Product> all() {
        return productList;
    }

    public Product byName(String name) {
        for (Product product : productList) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }


}
