//package pl.motorola.sklep.api;
//
//import lombok.AllArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//import pl.motorola.sklep.model.Product;
//import pl.motorola.sklep.model.dto.ProductDto;
//import pl.motorola.sklep.model.mapping.ProductMapper;
//import pl.motorola.sklep.service.ProductService;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/v1/product")
//@AllArgsConstructor
//public class ProductApi {
//
//    private final ProductService productService;
//    private ProductMapper productMapper;
//
//    @PostMapping
//    public ResponseEntity<Void> addProduct(@RequestBody Product product){
//        productService.save(product);
//        return new ResponseEntity<Void>(HttpStatus.CREATED);
//    }
//
//    @GetMapping
//    public ResponseEntity<List<ProductDto>> findAll(){
//        List<ProductDto> allProducts = productService.findAll();
//        return new ResponseEntity<List<ProductDto>>(allProducts, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Product> findById(@PathVariable Long id){
//        Product product = productService.findById(id);
//        return new ResponseEntity<Product>(product,HttpStatus.OK);
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> removeById(@PathVariable Long id){
//        boolean removed = productService.removeById(id);
//
//        if(!removed){
//            return new ResponseEntity<Void>(HttpStatus.NOT_FOUND);
//        }
//
//        return new ResponseEntity<Void>(HttpStatus.OK);
//    }
//
//}
