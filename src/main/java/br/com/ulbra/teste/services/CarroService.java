package br.com.ulbra.teste.services;

import br.com.ulbra.teste.repositories.CarroRepository;
import br.com.ulbra.teste.models.Carro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarroService {
    private CarroRepository carroRepository;

    public CarroService(CarroRepository carroRepository) {
        this.carroRepository = carroRepository;
    }

    public Carro getById(int id) {
        Carro carro = this.carroRepository.getCarros()
                .stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .get();

        return carro;
    }

    public List<Carro> getCarros() {
        return this.carroRepository.getCarros();
    }

    public void criaCarro(Carro body) {
        this.carroRepository.criaCarro(body);
    }
}