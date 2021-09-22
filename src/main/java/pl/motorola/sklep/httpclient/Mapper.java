package pl.motorola.sklep.httpclient;

public interface Mapper<E, D> {

    E toEntity(D dto);

    D toDto(E entity);
}