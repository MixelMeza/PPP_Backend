package pe.edu.upeu.pracway.Pracway.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.upeu.pracway.Pracway.entity.Rol;
import pe.edu.upeu.pracway.Pracway.entity.Usuario;
import pe.edu.upeu.pracway.Pracway.service.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;



    @PostMapping
    public ResponseEntity<?> crearUsuario(@RequestBody Usuario usuario) {
        try {
            Usuario createdUsuario = usuarioService.create(usuario);
            return new ResponseEntity<>(createdUsuario, HttpStatus.CREATED);  
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);  
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> actualizarUsuario(@PathVariable Long id, @RequestBody Usuario usuario) {
        try {
            usuario.setId(id);
            Usuario updatedUsuario = usuarioService.update(usuario);
            return new ResponseEntity<>(updatedUsuario, HttpStatus.OK);  
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);  
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarUsuario(@PathVariable Long id) {
        try {
            usuarioService.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT); 
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);  
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> obtenerUsuario(@PathVariable Long id) {
        try {
            Optional<Usuario> usuario = usuarioService.read(id);
            if (usuario.isPresent()) {
                return new ResponseEntity<>(usuario.get(), HttpStatus.OK);  
            } else {
                return new ResponseEntity<>("Usuario no encontrado", HttpStatus.NOT_FOUND); 
            }
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR); 
        }
    }

    @GetMapping
    public ResponseEntity<?> obtenerTodosLosUsuarios() {
        try {
            List<Usuario> usuarios = usuarioService.readAll();
            return new ResponseEntity<>(usuarios, HttpStatus.OK); 
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);  
        }
    }


    @PostMapping("/{idUsuario}/agregarRol/{idRol}")
    public ResponseEntity<?> asignarRolAUsuario(@PathVariable Long idUsuario, @PathVariable Long idRol) {
        try {
            usuarioService.asignarRolAUsuario(idUsuario, idRol);
            return new ResponseEntity<>(HttpStatus.OK); 
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);  
        }
    }

    @DeleteMapping("/{idUsuario}/eliminarRol/{idRol}")
    public ResponseEntity<?> eliminarRolDeUsuario(@PathVariable Long idUsuario, @PathVariable Long idRol) {
        try {
            usuarioService.eliminarRolDeUsuario(idUsuario, idRol);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);  
        }
    }

    @GetMapping("/{idUsuario}/roles")
    public ResponseEntity<?> obtenerRolesDeUsuario(@PathVariable Long idUsuario) {
        try {
            List<Rol> roles = usuarioService.obtenerRolesDeUsuario(idUsuario);
            return new ResponseEntity<>(roles, HttpStatus.OK);  
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);  
        }
    }

    @DeleteMapping("/{idUsuario}/eliminarTodosLosRoles")
    public ResponseEntity<?> eliminarTodosLosRolesDeUsuario(@PathVariable Long idUsuario) {
        try {
            usuarioService.eliminarTodosLosRolesDeUsuario(idUsuario);
            return new ResponseEntity<>(HttpStatus.OK); 
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}