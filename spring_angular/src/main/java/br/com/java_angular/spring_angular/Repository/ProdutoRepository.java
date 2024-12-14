package br.com.java_angular.spring_angular.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.java_angular.spring_angular.Model.Produto;

@Repository
public interface ProdutoRepository  extends JpaRepository <Produto,Long>{
    
}
