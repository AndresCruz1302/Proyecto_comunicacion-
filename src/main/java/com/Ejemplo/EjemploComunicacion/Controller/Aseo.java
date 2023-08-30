package com.Ejemplo.EjemploComunicacion.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Aseo {
    @GetMapping("/Aseo")
    public String AseoM(){
        return "Aseo";
    }
}
