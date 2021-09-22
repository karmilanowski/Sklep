package pl.motorola.sklep.httpclient;

import pl.motorola.sklep.httpclient.dto.ProductDto;

import java.util.List;

public interface RemoteProducts {

    List<ProductDto> getProducts();
}
