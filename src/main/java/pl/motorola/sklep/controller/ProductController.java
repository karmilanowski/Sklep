package pl.motorola.sklep.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import pl.motorola.sklep.model.Product;
import pl.motorola.sklep.service.CartService;
import pl.motorola.sklep.service.ProductService;

import java.util.Optional;


@Controller
@AllArgsConstructor
public class ProductController {

    private ProductService productService;
    private CartService cartService;

    @GetMapping("/products/addToCart")
    String addToCart(@RequestParam("productId") long id){
        Optional<Product> products = productService.findById(id);
        Product product = products.get();
        return "redirect:/cart";
    }
}
