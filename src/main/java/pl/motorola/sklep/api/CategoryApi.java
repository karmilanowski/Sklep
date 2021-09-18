package pl.motorola.sklep.api;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
import pl.motorola.sklep.service.CategoryService;

@RestController
@AllArgsConstructor
public class CategoryApi {

    private final CategoryService categoryService;


}
