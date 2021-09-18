package pl.motorola.sklep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.annotations.ApiIgnore;

@ApiIgnore
@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping()
    String getAdminBookmark(){
        return "admin";
    }
}
