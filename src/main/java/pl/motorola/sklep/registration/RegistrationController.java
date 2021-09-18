package pl.motorola.sklep.registration;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/registration")
@AllArgsConstructor
public class RegistrationController {

    private final RegistrationService registrationService;

    @PostMapping()
    public void addUser(@RequestBody RegistrationRequest request){
        registrationService.register(request);
    }

    @GetMapping()
    public List<AppUser> findAll(){
        return registrationService.findAll();
    }

}
