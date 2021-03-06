package guru.springframework.sfgpetclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Michael McEvoy
 * 09/21/2018
 */
@RequestMapping("/pets")
@Controller
public class PetController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listOfPets() {
        return "pets/index";
    }
}
