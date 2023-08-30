package com.Ejemplo.EjemploComunicacion.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Juguetes {
    @GetMapping("/Juguetes")
    public String Jueguete(){
        return "Juguetes";
    }
}
