package pl.motorola.sklep.httpclient;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.motorola.sklep.httpclient.dto.ProductDto;
import pl.motorola.sklep.model.Category;
import pl.motorola.sklep.model.Product;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
@AllArgsConstructor
public class ProductsMapper implements Mapper<List<Product>, List<ProductDto>>{

    private CategoryValidator categoryValidator;

    @Override
    public List<Product> toEntity(List<ProductDto> dto) {
        List<Product> productList = new ArrayList<>();
        for (ProductDto productDto : dto) {
            productList.add(new Product(
                    productDto.getTitle(),
                    productDto.getPrice(),
                    productDto.getDescription(),
                    categoryValidator.validate(productDto),
                    productDto.getImage(),
                    productDto.getRating().getRate(),
                    productDto.getRating().getCount()));
        }
        return productList;
    }

    @Override
    public List<ProductDto> toDto(List<Product> entity) {
        return null;
    }
}
