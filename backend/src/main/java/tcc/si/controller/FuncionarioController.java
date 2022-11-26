package tcc.si.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tcc.si.model.Consulta;
import tcc.si.model.ListResponse;
import tcc.si.model.ObjectResponse;
import tcc.si.model.Usuario;
import tcc.si.repository.ConsultaRepository;
import tcc.si.repository.UserRepository;
import tcc.si.service.UserService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1/user/funcionario")
public class FuncionarioController {
    @Autowired
    private UserRepository userRepository;

    private ConsultaRepository consultaRepository;

    @Autowired
    UserService userService;

    /*
     * Get todos usuarios
     */
    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ListResponse getAllUsers(HttpServletResponse http) {
        ListResponse response = new ListResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        List<Usuario> users = userRepository.findAll();
        response.setData(users);
        return response;
    }

    /**
     * Cria usuario
     */
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public ListResponse saveUser(@RequestBody final Usuario user, HttpServletResponse http) {
        userRepository.save(user);
        ListResponse response = new ListResponse();
        response.setMessage("Successfully Created");
        response.setStatusCode(http.getStatus());
        List<Usuario> users = userRepository.findAll();
        response.setData(users);
        return response;
    }

    /**
     * Get em usuario espeficico
     */
    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ObjectResponse getUser(@PathVariable("id") Integer userId, HttpServletResponse http) {
        ObjectResponse response = new ObjectResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        response.setData(userRepository.findById(userId));
        return response;
    }

    /**
     * atualiza usuario
     */
    @RequestMapping(value = "/user/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody JSONObject jsonObject)
            throws Exception {
        return userService.updateDadoUsuario(id, jsonObject);
    }

    /*
    * POST cadastrar consulta
    */

    @RequestMapping(value = "/consulta",method = RequestMethod.POST)
    public ListResponse salveConsulta(@RequestBody final Consulta consulta, HttpServletResponse http) {
        consultaRepository.save(consulta);
        ListResponse response = new ListResponse();
        response.setMessage("Successfully Created");
        response.setStatusCode(http.getStatus());
        List<Consulta> consultas = consultaRepository.findAll();
        response.setData(consultas);
        return response;
    }

    /*
     * Get em uma consulta especifica
     */

    @RequestMapping(value = "/consulta/{id}", method = RequestMethod.GET)
    public ObjectResponse getConsulta(@PathVariable("id") Integer id, HttpServletResponse http) {
        ObjectResponse response = new ObjectResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        response.setData(consultaRepository.findById(id));
        return response;
    }

    /*
    * Get em todas consultas
    */

    @RequestMapping(value = "/consulta", method = RequestMethod.GET)
    public ListResponse getAllColsultas(HttpServletResponse http) {
        ListResponse response = new ListResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        List<Consulta> consultas = consultaRepository.findAll();
        response.setData(consultas);
        return response;
    }
}
