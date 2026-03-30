package com.demo.app.controller.web;

import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    // Los HTML van en la carpeta template, por ejemplo: src/main/resources/templates/login.html

    @GetMapping("/login")
    public String loginPage() {
        return "login"; // 
    }

    @GetMapping("/dashboard")
    public String dashboard(Model model, Authentication authentication) {
        model.addAttribute("username", authentication.getName());
        model.addAttribute("activePage", "dashboard");   // ← esta línea
        model.addAttribute("roles", authentication.getAuthorities());
        return "dashboard";
    }

    @GetMapping("/")
    public String root() {
        return "redirect:/dashboard";
    }

}