package com.Ejemplo.EjemploComunicacion.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Comida {
    @GetMapping("/Comida")
    public String Comidas(){
        return "Comida";
    }
}
