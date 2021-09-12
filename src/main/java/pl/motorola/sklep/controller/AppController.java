package pl.motorola.sklep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.motorola.sklep.model.Product;
import pl.motorola.sklep.repository.ProductRepository;

import java.util.List;

@Controller
@RequestMapping()
public class AppController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/")
    String getAllProducts(Model model){
        List<Product> productList = productRepository.all();
        model.addAttribute("products", productList);
        return "index";
    }

    @GetMapping("/{name}")
    String productsDetails(@PathVariable String name, Model model){
        Product product = productRepository.byName(name);
        model.addAttribute("prod", product);
        return "details";
    }

}
