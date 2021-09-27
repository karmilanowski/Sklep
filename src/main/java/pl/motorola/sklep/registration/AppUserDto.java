package pl.motorola.sklep.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@EqualsAndHashCode
@ToString
public class AppUserDto {
    private final String firstName;
    private final String lastName;
    private final String email;
    private final String password;
    private final AppUserRole role;
}
