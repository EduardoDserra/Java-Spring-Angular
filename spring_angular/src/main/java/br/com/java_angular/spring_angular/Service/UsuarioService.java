package br.com.java_angular.spring_angular.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.java_angular.spring_angular.Model.Usuario;
import br.com.java_angular.spring_angular.Repository.UsuarioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    
    public List<Usuario> buscarUsuarios() {
        return usuarioRepository.findAll();
    }

    
    public Usuario buscarPorId(Long id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.orElse(null);
    }

    
    public Usuario salvarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    
    public void deletarUsuario(Long id) {
       if (usuarioRepository.existsById(id))
         {
            usuarioRepository.deleteById(id);
       }else {
        throw new RuntimeException("Usuario não encontrado com id: " + id);
    }
       
       ;
    }
}
