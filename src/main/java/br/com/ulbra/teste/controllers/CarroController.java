package br.com.ulbra.teste.controllers;

import br.com.ulbra.teste.models.Carro;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    List<Carro> carros = new ArrayList<>();

    @GetMapping
    public List<Carro> getCarro() {
        return carros;
    }

    @PostMapping
    public void createCarro(@RequestBody Carro body) {
        carros.add(body);
    }
}
