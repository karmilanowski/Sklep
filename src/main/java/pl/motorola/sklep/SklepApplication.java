package pl.motorola.sklep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import pl.motorola.sklep.model.Product;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class SklepApplication {

    public static void main(String[] args) {
        SpringApplication.run(SklepApplication.class, args);
    }


}
