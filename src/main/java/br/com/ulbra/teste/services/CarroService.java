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
        return this.carroRepository.getCarros()
                .stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Carro> getCarros() {
        return this.carroRepository.getCarros();
    }

    public void criaCarro(Carro body) {
        this.carroRepository.criaCarro(body);
    }

    public boolean deleteCarro(int id) {
        return this.carroRepository.deleteCarro(id);
    }

    public boolean updateCarro(Carro carro) {
        return this.carroRepository.updateCarro(carro);
    }
}
