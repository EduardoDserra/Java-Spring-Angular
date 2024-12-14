package br.com.java_angular.spring_angular.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.java_angular.spring_angular.Model.Categoria;
import br.com.java_angular.spring_angular.Service.CategoriaService;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaService categoriaService;

    // Endpoint para buscar todas as categorias
    @GetMapping
    public List<Categoria> buscarCategorias() {
        return categoriaService.buscarCategorias();
    }

    // Endpoint para buscar uma categoria por ID
    @GetMapping("/{id}")
    public Categoria buscarCategoriaPorId(@PathVariable Long id) {
        return categoriaService.buscarPorId(id);
    }

    // Endpoint para salvar ou atualizar uma categoria
    @PostMapping
    public Categoria salvarCategoria(@RequestBody Categoria categoria) {
        return categoriaService.salvarCategoria(categoria);
    }

    // Endpoint para deletar uma categoria
    @DeleteMapping("/{id}")
    public void deletarCategoria(@PathVariable Long id) {
        categoriaService.deletarCategoria(id);
    }
}