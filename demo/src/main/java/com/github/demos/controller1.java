package com.github.demos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class controller1 {
   // private String usuario;

    @GetMapping("/n")
    public String hola(Model modelo){
        return "BIENVENIDO";
    }

}
