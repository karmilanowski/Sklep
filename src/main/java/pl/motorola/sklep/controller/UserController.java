package pl.motorola.sklep.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.motorola.sklep.model.Product;
import pl.motorola.sklep.repository.ProductRepository;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;
import java.util.stream.Collectors;

@ApiIgnore
@Controller
@RequestMapping("/")
@AllArgsConstructor
public class UserController {

    private ProductRepository productRepository;

    @GetMapping()
  String getHome(Model model){
        List<Product> productList = productRepository.findAll();
        model.addAttribute("products", productList);
      return "products";
  }
    @GetMapping("products")
    String getProducts(Model model){
        List<Product> productList = productRepository.findAll().stream().filter(p->p.getQuantity()>100).collect(Collectors.toList());
        model.addAttribute("products", productList);
        return "products";
    }
    @GetMapping("cart")
    String getCart(Model model){
        return "cart";
    }
    @GetMapping("history")
    String getHistory(Model model){
        return "history";
    }

}
