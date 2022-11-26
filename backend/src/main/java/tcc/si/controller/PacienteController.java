package tcc.si.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.*;
import tcc.si.model.ObjectResponse;
import tcc.si.repository.ConsultaRepository;
import tcc.si.repository.UserRepository;
import tcc.si.service.UserService;

import javax.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1/user/paciente")
public class PacienteController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    UserService userService;

    /**
     * Get a specific user
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ObjectResponse getUser(@PathVariable("id") Integer userId, HttpServletResponse http) {
        ObjectResponse response = new ObjectResponse();
            response.setMessage("Successfully Retrieved");
            response.setStatusCode(http.getStatus());
            response.setData(userRepository.findById(userId));
        return response;
    }

    @RequestMapping(value = "/consulta/{id}", method = RequestMethod.GET)
    public ObjectResponse getConsulta(@PathVariable("id") Integer id, HttpServletResponse http) {
        ObjectResponse response = new ObjectResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        response.setData(consultaRepository.findById(id));
        return response;
    }

}
