package pl.motorola.sklep.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Component
public class Product {
    private String name;
    private String description;
    private BigDecimal price;


}
