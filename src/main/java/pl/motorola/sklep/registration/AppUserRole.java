package pl.motorola.sklep.registration;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum AppUserRole {
    USER("USER"),
    ADMIN("ADMIN");

    private String name;

}
