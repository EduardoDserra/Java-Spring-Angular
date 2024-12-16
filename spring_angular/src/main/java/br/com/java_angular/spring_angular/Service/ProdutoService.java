package br.com.java_angular.spring_angular.Service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.java_angular.spring_angular.Model.Produto;

import br.com.java_angular.spring_angular.Repository.ProdutoRepository;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository produtoRepository;

  

    
    public List<Produto> buscarProdutos() {
        return produtoRepository.findAll();
    }

    
    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    
     
     public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    
    public void deletarProduto(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Produto não encontrado com id: " + id);
        }
    }
}
