package controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pages {
    @GetMapping("/pages")
    public String welcome() {
        return "Welcome to the countries page";
    }

}
