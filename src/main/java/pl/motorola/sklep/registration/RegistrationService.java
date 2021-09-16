package pl.motorola.sklep.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import pl.motorola.sklep.model.AppUser;
import pl.motorola.sklep.model.AppUserRole;
import pl.motorola.sklep.service.AppUserService;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final EmailValidator emailValidator;
    private final AppUserService appUserService;

    public void register(RegistrationRequest request) {
        boolean isValidEmail = emailValidator.test(request.getEmail());
        if(!isValidEmail){
            throw new IllegalStateException("Invalid email !");
        }
        appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        AppUserRole.USER

                ));

    }


}
