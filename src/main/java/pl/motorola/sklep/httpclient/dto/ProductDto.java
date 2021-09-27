package pl.motorola.sklep.httpclient.dto;

import lombok.*;
import pl.motorola.sklep.model.Category;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ProductDto {
    private String title;
    private BigDecimal price;
    private String description;
    private String category;
    private String image;
    private Rating rating;
}
