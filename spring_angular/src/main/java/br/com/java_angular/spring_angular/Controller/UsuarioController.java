package br.com.java_angular.spring_angular.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import br.com.java_angular.spring_angular.Exception.ResourceNotFoundException;
import br.com.java_angular.spring_angular.Model.Usuario;
import br.com.java_angular.spring_angular.Service.UsuarioService;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    // Endpoint para buscar todos os usuários
    @GetMapping
    public List<Usuario> buscarUsuarios() {
        return usuarioService.buscarUsuarios();
    }

    // Endpoint para buscar um usuário por ID
    @GetMapping("/{id}")
    public Usuario buscarUsuarioPorId(@PathVariable Long id) {
        Usuario usuario = usuarioService.buscarPorId(id);
        if (usuario == null) {
            throw new ResourceNotFoundException("Usuário não encontrado com ID: " + id);
        }
        return usuario;
    }

    // Endpoint para salvar ou atualizar um usuário
    @PostMapping
    public Usuario salvarUsuario(@RequestBody Usuario usuario) {
        return usuarioService.salvarUsuario(usuario);
    }

    // Endpoint para deletar um usuário
    @DeleteMapping("/{id}")
    public void deletarUsuario(@PathVariable Long id) {
        usuarioService.deletarUsuario(id);
    }
}
