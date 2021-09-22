package pl.motorola.sklep.products.client;

import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import pl.motorola.sklep.products.RemoteProducts;
import pl.motorola.sklep.products.dto.ProductsDto;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class ProductHttpClient implements RemoteProducts {

    private final RestTemplate restTemplate;
    private final String uri;

    @Override
    public List<ProductsDto> getProducts() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<HttpHeaders> httpEntity = new HttpEntity<>(headers);
        try{
            ResponseEntity<List<ProductsDto>> response = restTemplate.exchange(uri, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<ProductsDto>>() {
            });
            List<ProductsDto> body = response.getBody();
            return (body!=null) ? body : Collections.emptyList();
        } catch (ResourceAccessException e) {
            return Collections.emptyList();
        }
    }


}
