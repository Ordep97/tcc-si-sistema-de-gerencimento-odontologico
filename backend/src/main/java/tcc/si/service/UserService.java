package tcc.si.service;

import org.springframework.http.ResponseEntity;
import org.json.simple.JSONObject;

public interface UserService {
    public abstract ResponseEntity<?> updateUser(Integer id, JSONObject jsonObject) throws Exception;
}
