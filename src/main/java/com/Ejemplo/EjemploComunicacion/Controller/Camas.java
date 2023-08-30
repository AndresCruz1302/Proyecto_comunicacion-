package com.Ejemplo.EjemploComunicacion.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Camas {
    @GetMapping("/Camas")
    public String Cama(){
        return "Camas";
    }
}
