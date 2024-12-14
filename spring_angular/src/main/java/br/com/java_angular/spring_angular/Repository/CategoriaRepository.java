package br.com.java_angular.spring_angular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java_angular.spring_angular.Model.Categoria;

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{
    
}
