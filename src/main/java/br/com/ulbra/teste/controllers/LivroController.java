package br.com.ulbra.teste.controllers;

import br.com.ulbra.teste.models.Livro;
import br.com.ulbra.teste.services.LivroService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroController {
    private LivroService livroService;

    public LivroController(LivroService livroService) { this.livroService = livroService; }

    @GetMapping("/{id}")
    public ResponseEntity<Livro> getById(@PathVariable int id) {
        Livro livro = this.livroService.getById(id);
        if (livro == null) { return ResponseEntity.status(HttpStatus.NOT_FOUND).build(); }
        return ResponseEntity.status(HttpStatus.OK).body(livro);
    }

    @GetMapping
    public ResponseEntity<List<Livro>> getLivros() {
        List<Livro> livros = this.livroService.getLivros();
        return ResponseEntity.status(HttpStatus.OK).body(livros);
    }

    @PostMapping
    public ResponseEntity<Livro> createLivro(@RequestBody Livro body) {
        this.livroService.criaLivro(body);
        return ResponseEntity.status(HttpStatus.CREATED).body(body);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteLivro(@PathVariable int id) {
        boolean removido = this.livroService.deleteLivro(id);
        if (removido) { return ResponseEntity.status(HttpStatus.OK).body("Livro removido com sucesso!"); }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Livro não encontrado.");
    }

    @PutMapping("/{id}")
    public ResponseEntity<Livro> updateLivro(@PathVariable int id, @RequestBody Livro livro) {
        livro.setId(id);
        boolean atualizado = livroService.updateLivro(livro);
        if (atualizado) { return ResponseEntity.status(HttpStatus.OK).body(livro); }
        return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
    }
}
