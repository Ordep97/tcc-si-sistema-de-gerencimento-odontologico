package tcc.si.service;

import org.springframework.http.ResponseEntity;
import org.json.simple.JSONObject;
import tcc.si.model.Endereco;
import tcc.si.model.Usuario;
import tcc.si.model.DadoUsuario;

public interface UserService {
    public abstract void updateUser(Usuario user, DadoUsuario dadoUsuario, Endereco endereco, JSONObject jsonObject) throws Exception;
    public abstract ResponseEntity<?> updateDadoUsuario(Integer id, JSONObject jsonObject) throws Exception;
}
