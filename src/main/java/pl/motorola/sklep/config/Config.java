package pl.motorola.sklep.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import pl.motorola.sklep.products.client.ProductHttpClient;
import pl.motorola.sklep.products.error.RestTemplateResponseErrorHandler;

import java.time.Duration;


@Configuration
public class Config {

    @Bean
    RestTemplateResponseErrorHandler restTemplateResponseErrorHandler(){
        return new RestTemplateResponseErrorHandler();
    }

    @Bean
    RestTemplate restTemplate(@Value("${product.http.client.config.connectionTimeout}") long connectionTimeout,
                              @Value("${product.http.client.config.readTimeout}") long readTimeout,
                              RestTemplateResponseErrorHandler errorHandler){
        return new RestTemplateBuilder()
                .errorHandler(errorHandler)
                .setConnectTimeout(Duration.ofMillis(connectionTimeout))
                .setReadTimeout(Duration.ofMillis(readTimeout))
                .build();
    }
    @Bean
    ProductHttpClient productHttpClient(RestTemplate restTemplate, @Value("${product.http.client.config.uri:http://example.com}") String uri){
        return new ProductHttpClient(restTemplate,uri);
    }
}
