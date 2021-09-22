package pl.motorola.sklep.httpclient.client;

import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.web.client.ResourceAccessException;
import org.springframework.web.client.RestTemplate;
import pl.motorola.sklep.httpclient.RemoteProducts;
import pl.motorola.sklep.httpclient.dto.ProductDto;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
public class ProductHttpClient implements RemoteProducts {

    private final RestTemplate restTemplate;
    private final String uri;

    @Override
    public List<ProductDto> getProducts() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        HttpEntity<HttpHeaders> httpEntity = new HttpEntity<>(headers);
        try{
            ResponseEntity<List<ProductDto>> response = restTemplate.exchange(uri, HttpMethod.GET, httpEntity, new ParameterizedTypeReference<List<ProductDto>>() {
            });
            List<ProductDto> body = response.getBody();
            return (body!=null) ? body : Collections.emptyList();
        } catch (ResourceAccessException e) {
            return Collections.emptyList();
        }
    }


}
