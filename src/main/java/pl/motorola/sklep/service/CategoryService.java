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

    List<Category> findAll(){
        return categoryRepository.findAll();
    }

    Category findById(long id){
        return categoryRepository.getById(id);
    }

    Category findByName(String name){
        return categoryRepository.findByName(name);
    }
}
