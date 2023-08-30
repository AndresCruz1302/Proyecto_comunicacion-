package com.Ejemplo.EjemploComunicacion.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Ropa {
    @GetMapping("/Ropa")
    public String Ropas(){
        return "Ropa";
    }
}
