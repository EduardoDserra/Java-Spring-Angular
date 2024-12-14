package br.com.java_angular.spring_angular.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Produtos")
public class Produto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private Double preco;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

    // Construtores
    public Produto() {
    };

    public Produto(String nome, Double preco, Categoria categoria) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    };

    // Getters e Setters
    public Long getId() {
        return id;
    };

    public void setId(Long id) {
      ;  this.id = id;
    }

    public String getNome() {
        return nome;
    };

    public void setNome(String nome) {
        this.nome = nome;
    };

    public Double getPreco() {
        return preco;
    };

    public void setPreco(Double preco) {
        this.preco = preco;
    };

    public Categoria getCategoria() {
        return categoria;
    };

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    };
}
