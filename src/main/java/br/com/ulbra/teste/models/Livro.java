package br.com.ulbra.teste.models;

public class Livro {
    private static int contador = 1;
    private int id = contador;
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao) {
        this.id = contador++;
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnoPublicacao() { return anoPublicacao; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
}
