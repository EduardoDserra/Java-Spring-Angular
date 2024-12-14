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

    // Método para listar todos os produtos
    public List<Produto> buscarProdutos() {
        return produtoRepository.findAll();
    }

    // Método para buscar um produto por ID
    public Produto buscarPorId(Long id) {
        return produtoRepository.findById(id).orElse(null);
    }

    // Método para salvar ou atualizar um produto
    public Produto salvarProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    // Método para deletar um produto por ID
    public void deletarProduto(Long id) {
        if (produtoRepository.existsById(id)) {
            produtoRepository.deleteById(id);
        } else {
            throw new RuntimeException("Produto não encontrado com id: " + id);
        }
    }
}