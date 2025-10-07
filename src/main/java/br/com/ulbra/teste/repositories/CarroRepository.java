package br.com.ulbra.teste.repositories;

import br.com.ulbra.teste.models.Carro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarroRepository {
    // VAI SER TROCADO POR UMA COMUNICACAO COM BANCO DE DADOS
    List<Carro> carros = new ArrayList<>();


    public List<Carro> getCarros() {
        return carros;
    }

    public void criaCarro(Carro body) {
        carros.add(body);
    }
}