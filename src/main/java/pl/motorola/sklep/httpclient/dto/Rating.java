package pl.motorola.sklep.httpclient.dto;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Rating {
    private double rate;
    private int count;
}
