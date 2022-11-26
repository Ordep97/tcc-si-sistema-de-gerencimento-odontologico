package tcc.si.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import tcc.si.model.ObjectResponse;
import tcc.si.repository.ConsultaRepository;
import tcc.si.repository.UserRepository;
import tcc.si.service.UserService;

import javax.servlet.http.HttpServletResponse;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1/user/dentista")
public class DentistaController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ConsultaRepository consultaRepository;

    @Autowired
    UserService userService;

    /**
     * Get em usuario espeficico
     */
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public ObjectResponse getUser(@PathVariable("id") Integer userId, HttpServletResponse http) {
        ObjectResponse response = new ObjectResponse();
            response.setMessage("Successfully Retrieved");
            response.setStatusCode(http.getStatus());
            response.setData(userRepository.findById(userId));
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

}
