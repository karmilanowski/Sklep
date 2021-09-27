package pl.motorola.sklep.httpclient;

import pl.motorola.sklep.model.Category;
import pl.motorola.sklep.model.Product;
import pl.motorola.sklep.repository.CategoryRepository;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CategoryValidator {
    private CategoryRepository categoryRepository;

    public Category validate(List<Product> productList){
        Set<Category> categories = new HashSet<>();
        for (Product product : productList) {
            categories.add(product.getCategory());
        }

    }
}
