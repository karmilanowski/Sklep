package pl.motorola.sklep.httpclient;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import pl.motorola.sklep.httpclient.dto.ProductDto;
import pl.motorola.sklep.model.Category;
import pl.motorola.sklep.service.CategoryService;

@Component
@AllArgsConstructor
public class CategoryValidator {
    private CategoryService categoryService;

    public Category validate(ProductDto product){
        Category category = categoryService.findByName(product.getCategory());
        if(category!=null){
            return category;
        }
        Category newCategory = new Category(product.getCategory());
        categoryService.save(newCategory);
        return newCategory;
    }
}
