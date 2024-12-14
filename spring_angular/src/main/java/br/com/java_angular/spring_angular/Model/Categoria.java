package br.com.java_angular.spring_angular.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Categorias")
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String nome;

    @OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Produto> produtos;

    // Construtores
    public Categoria() {
    };

    public Categoria(String nome) {
        this.nome = nome;
    };

    // Getters e Setters
    public Long getId() {
        return id;
    };

    public void setId(Long id) {
        this.id = id;
    };

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public List<Produto> getProdutos() {
        return produtos;
    };

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    };
}