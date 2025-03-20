package com.devjava.CadastroDeUsuarios;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class controller {

    @GetMapping("/welcome") // não utilizar cammelCase quando for passar enderecos no GetMapping
    public String welcome(){
        return "Boas Vindas";
    }

}
