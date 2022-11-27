package tcc.si.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tcc.si.model.Consulta;
import tcc.si.model.Usuario;
import tcc.si.repository.ConsultaRepository;
import tcc.si.repository.UserRepository;
import tcc.si.service.UserService;

import java.util.Optional;

@RestController
@EnableAutoConfiguration
@RequestMapping("/v1")
public class UsuarioController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    UserService userService;

    @RequestMapping(value = "/getSenha/{id}", method = RequestMethod.GET)
    public String pegarSenha(@PathVariable Integer id) throws Exception{
        return userService.getSenhaUser(id);
    }

    /**
     * Get em usuario espeficico
     */
    @RequestMapping(value = "/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<Usuario> getUserById(@PathVariable(value = "id") Integer id)
    {
        Optional<Usuario> user = userRepository.findById(id);
        if(user.isPresent())
            return new ResponseEntity<Usuario>(user.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    /*
     * Get em uma consulta especifica
     */

    @RequestMapping(value = "/consultas/{id}", method = RequestMethod.GET)
    public ResponseEntity<Consulta> getConsultaById(@PathVariable(value = "id") Integer id)
    {
        Optional<Consulta> consulta = consultaRepository.findById(id);
        if(consulta.isPresent())
            return new ResponseEntity<Consulta>(consulta.get(), HttpStatus.OK);
        else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
