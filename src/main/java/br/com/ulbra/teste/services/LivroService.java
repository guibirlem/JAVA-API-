package br.com.ulbra.teste.services;

import br.com.ulbra.teste.repositories.LivroRepository;
import br.com.ulbra.teste.models.Livro;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivroService {
    private LivroRepository livroRepository;

    public LivroService(LivroRepository livroRepository) { this.livroRepository = livroRepository; }

    public Livro getById(int id) {
        return this.livroRepository.getLivros()
                .stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
    }

    public List<Livro> getLivros() { return this.livroRepository.getLivros(); }

    public void criaLivro(Livro body) { this.livroRepository.criaLivro(body); }

    public boolean deleteLivro(int id) { return this.livroRepository.deleteLivro(id); }

    public boolean updateLivro(Livro livro) { return this.livroRepository.updateLivro(livro); }
}
