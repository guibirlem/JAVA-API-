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

    public boolean deleteCarro(int id) {
        return carros.removeIf(carro -> carro.getId() == id);
    }

    public boolean updateCarro(Carro carro) {
        for (int i = 0; i < carros.size(); i++) {
            if (carros.get(i).getId() == carro.getId()) {
                carros.set(i, carro);
                return true;
            }
        }
        return false;
    }
}