package controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Countries {

    @GetMapping("/countries")
    public String welcome() {
        return "no countries";

    }
}
