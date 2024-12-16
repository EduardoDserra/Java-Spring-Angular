package br.com.java_angular.spring_angular.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;



@Entity
@Table(name = "Usuarios")
@Getter
@Setter
public class Usuario {

    @Id
    private Long id;
    private String nome;
    private String senha;

    
    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }
 

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
