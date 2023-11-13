package br.com.anthonythomas.todolist.usuarios;
//nome de classe sempre maiuscula

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * modificador
 * pulic
 * private
 * protected
 */
@RestController

@RequestMapping("/usuarios")
public class UsuarioController {

    /*
     * string "texto"
     * interger numero inteiro
     * double numeros 0.00000
     * float numeros 0.00000
     * char A C
     * Date data
     * void
     * body
     */
    @PostMapping("/")
    public void create(@RequestBody UsuarioModel usuarioModel) {
        System.out.println(usuarioModel.getUsername());
     
    }
}
