package br.com.ulbra.teste.repositories;

import br.com.ulbra.teste.models.Livro;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LivroRepository {
    List<Livro> livros = new ArrayList<>();

    public List<Livro> getLivros() { return livros; }

    public void criaLivro(Livro body) { livros.add(body); }

    public boolean deleteLivro(int id) { return livros.removeIf(livro -> livro.getId() == id); }

    public boolean updateLivro(Livro livro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getId() == livro.getId()) {
                livros.set(i, livro);
                return true;
            }
        }
        return false;
    }
}
