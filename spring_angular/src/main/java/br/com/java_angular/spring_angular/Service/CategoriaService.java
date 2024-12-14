package br.com.java_angular.spring_angular.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java_angular.spring_angular.Model.Categoria;
import br.com.java_angular.spring_angular.Repository.CategoriaRepository;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    // Método para listar todas as categorias
    public List<Categoria> buscarCategorias() {
        return categoriaRepository.findAll();
    }

    // Método para buscar uma categoria por ID
    public Categoria buscarPorId(Long id) {
        return categoriaRepository.findById(id).orElse(null);
    }

    // Método para salvar ou atualizar uma categoria
    public Categoria salvarCategoria(Categoria categoria) {
        return categoriaRepository.save(categoria);
    }

    // Método para deletar uma categoria por ID
    public void deletarCategoria(Long id) {
        if (categoriaRepository.existsById(id)) {
            categoriaRepository.deleteById(id);
        } else {
            throw new RuntimeException("Categoria não encontrada com id: " + id);
        }
    }
}