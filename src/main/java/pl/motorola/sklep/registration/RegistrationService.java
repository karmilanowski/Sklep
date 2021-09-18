package pl.motorola.sklep.registration;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegistrationService {

    private final AppUserService appUserService;
    private AppUserRepository appUserRepository;

    public void register(RegistrationRequest request) {
        appUserService.signUpUser(
                new AppUser(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword(),
                        request.getRole()

                ));

    }

    public List<AppUser> findAll(){
        return appUserRepository.findAll();
    }


}
