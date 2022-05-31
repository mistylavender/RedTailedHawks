package com.nighthawk.csa;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.nighthawk.csa.model.starters.AsciiImage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;

@Controller  // HTTP requests are handled as a controller, using the @Controller annotation
public class MainController {

    @GetMapping("/Database/login")
    public String databaseLogin(Model model) {
        return "Database/login";
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