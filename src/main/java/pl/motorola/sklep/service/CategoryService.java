package pl.motorola.sklep.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.motorola.sklep.model.Category;
import pl.motorola.sklep.repository.CategoryRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoryService {

    private final CategoryRepository categoryRepository;

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(long id){
        return categoryRepository.getById(id);
    }

    public Category findByName(String name){
        return categoryRepository.findByName(name);
    }

    public Category save(Category category){
        Category searchingCategory = categoryRepository.findByName(category.getName());
        if(searchingCategory!=null){
            return null;
        }
        else {
            categoryRepository.save(category);
            return category;
        }
    }
}
