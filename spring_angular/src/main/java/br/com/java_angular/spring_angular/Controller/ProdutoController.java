package br.com.java_angular.spring_angular.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.java_angular.spring_angular.Exception.ResourceNotFoundException;
import br.com.java_angular.spring_angular.Model.Produto;
import br.com.java_angular.spring_angular.Service.ProdutoService;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;

    // Endpoint para buscar todos os produtos
    @GetMapping
    public List<Produto> buscarProdutos() {
        return produtoService.buscarProdutos();
    }

    // Endpoint para buscar produto por ID
    @GetMapping("/{id}")
    public Produto buscarProdutoPorId(@PathVariable Long id) {
        Produto produto = produtoService.buscarPorId(id);
        if (produto == null) {
            // Lançando a exceção personalizada caso o produto não seja encontrado
            throw new ResourceNotFoundException("Produto não encontrado com ID: " + id);
        }
        return produto;
    }  

      // Endpoint para salvar um novo produto ou atualizar
      @PostMapping
      public Produto salvarProduto(@RequestBody Produto produto) {
          return produtoService.salvarProduto(produto);
      }
  

    // Endpoint para deletar um produto
    @DeleteMapping("/{id}")
    public void deletarProduto(@PathVariable Long id) {
        produtoService.deletarProduto(id);
    }
}
