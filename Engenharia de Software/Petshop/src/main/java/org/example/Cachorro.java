package org.example;

public class Cachorro {
    private String nome;

    // Construtor para inicializar o nome do cachorro
    public Cachorro(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome do cachorro
    public String getNome() {
        return nome;
    }

    // Método para definir um novo nome para o cachorro
    public void setNome(String nome) {
        this.nome = nome;
    }
}
