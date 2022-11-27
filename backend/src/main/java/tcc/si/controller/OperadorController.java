package tcc.si.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tcc.si.model.*;
import tcc.si.repository.ConsultaRepository;
import tcc.si.repository.UserRepository;
import tcc.si.service.UserService;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@EnableAutoConfiguration
@RequestMapping("/v1/operador")
public class OperadorController {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    UserService userService;

    /*
     * Lista todos usuarios
     */
    @RequestMapping(value = "/users", method = RequestMethod.GET)
    public List<Usuario> getUsers() {
        return userRepository.findAll();
    }

    /**
     * Cadastra usuario
     */

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    public Usuario creatUser(@Valid @RequestBody final Usuario user)
    {
        return userRepository.save(user);
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
     * atualizar usuario
     */
    @RequestMapping(value = "/users/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody JSONObject jsonObject)
            throws Exception {
        return userService.rpUpdateUser(id, jsonObject);
    }

    /*
    * Cadastrar consulta
    */

    @RequestMapping(value = "/consultas",method = RequestMethod.POST)
    public Consulta criarConsulta(@Valid @RequestBody final Consulta consulta)
    {
        return consultaRepository.save(consulta);
    }

    /*
     * atualizar consulta
     */
    @RequestMapping(value = "/consultas/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Consulta> updateConsulta(@PathVariable(value = "id") Integer id, @Valid @RequestBody Consulta newConsulta)
    {
        Optional<Consulta> oldConsulta = consultaRepository.findById(id);
        if(oldConsulta.isPresent()){
            Consulta consulta = oldConsulta.get();
            consulta.setData(newConsulta.getData());
            consulta.setPacientes(newConsulta.getPacientes());
            consulta.setObservacao(newConsulta.getObservacao());
            consultaRepository.save(consulta);
            return new ResponseEntity<Consulta>(consulta, HttpStatus.OK);
        }
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

    /*
    * Get em todas consultas
    */

    @RequestMapping(value = "/consultas", method = RequestMethod.GET)
    public List<Consulta> getConsultas() {
        return consultaRepository.findAll();
    }
}
