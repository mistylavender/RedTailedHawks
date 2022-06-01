package com.nighthawk.csa;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MainController {

    @GetMapping("/login")
    public String Login(Model model) {
        return "/login";
    }


    @GetMapping("/gallery")
    public String Gallery(Model model) {
        return "/gallery";
    }

    @GetMapping("/about")
    public String About(Model model) {
        return "/about";
    }

}