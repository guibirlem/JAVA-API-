package br.com.ulbra.teste.controllers;

import br.com.ulbra.teste.models.Carro;
import br.com.ulbra.teste.services.CarroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/carros")
public class CarroController {
    private CarroService carroService;

    public CarroController(CarroService carroService) {
        this.carroService = carroService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carro> getById(@PathVariable int id) {
        Carro carro = this.carroService.getById(id);
        return ResponseEntity.status(HttpStatus.OK).body(carro);
    }


    @GetMapping
    public ResponseEntity<List<Carro>> getCarro() {
        List<Carro> carros = this.carroService.getCarros();
        return ResponseEntity.status(HttpStatus.OK).body(carros);
    }

    @PostMapping
    public ResponseEntity<Carro> createCarro(@RequestBody Carro body) {
        this.carroService.criaCarro(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }
}