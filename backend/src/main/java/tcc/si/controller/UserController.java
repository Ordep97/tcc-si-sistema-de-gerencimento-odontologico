package tcc.si.controller;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tcc.si.model.Usuario;
import tcc.si.repository.UserRepository;
import tcc.si.service.UserService;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@EnableAutoConfiguration
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    UserService userService;

    /*
     * Get all users
     */
    @RequestMapping(method = RequestMethod.GET)
    public ListResponse getAllUsers(HttpServletResponse http) {
        ListResponse response = new ListResponse();
        response.setMessage("Successfully Retrieved");
        response.setStatusCode(http.getStatus());
        List<Usuario> users = userRepository.findAll();
        response.setData(users);
        return response;
    }

    /**
     * Create new user
     */
    @RequestMapping(method = RequestMethod.POST)
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

    /**
     * update a user
     */
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> updateUser(@PathVariable Integer id, @RequestBody JSONObject jsonObject)
            throws Exception {
        return userService.updateDadoUsuario(id, jsonObject);
    }

}
