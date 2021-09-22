package pl.motorola.sklep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.web.client.RestTemplate;
import pl.motorola.sklep.httpclient.client.ProductHttpClient;
import pl.motorola.sklep.httpclient.dto.ProductDto;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;


@EnableSwagger2
@SpringBootApplication
public class SklepApplication {



    public static void main(String[] args) {
        SpringApplication.run(SklepApplication.class, args);
    }

    @EventListener(ApplicationReadyEvent.class)
    void clienTest(){
        ProductHttpClient productHttpClient = new ProductHttpClient(new RestTemplate(),"https://fakestoreapi.com/products");
        List<ProductDto> products = productHttpClient.getProducts();
        products.forEach(System.out::println);
    }


}
