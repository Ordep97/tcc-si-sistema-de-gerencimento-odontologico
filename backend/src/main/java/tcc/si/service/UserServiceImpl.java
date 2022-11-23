package tcc.si.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tcc.si.model.User;
import tcc.si.model.UserData;
import tcc.si.repository.UserDataRepository;
import tcc.si.repository.UserRepository;

@Service
public class UserServiceImpl {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public void updateUser( Usuario usuario, DadoUsuario dado, JSONObject jsonObject) throws Exception {
        String telefone;

        String email;
        String bairro;
        String complemento;
        String rua;
        String estado;

        String cidade;
        String cpf;


        try {
            telefone = (String) jsonObject.get("telefone");
            email = (String) jsonObject.get("email");
            bairro = (String) jsonObject.get("bairro");
            complemento = (String) jsonObject.get("complemento");
            rua = (String) jsonObject.get("rua");
            estado = (String) jsonObject.get("estado");
            cidade = (String) jsonObject.get("cidade");
            cpf = (String) jsonObject.get("cpf");




            dado.setTelefone(telefone);
            dado.setEmail(email);
            dado.setBairro(bairro);
            dado.setComplemento(complemento);
            dado.setRua(rua);
            dado.setEstado(estado);
            dado.setCidade(cidade);
            dado.setCpf(cpf);

            dadoUsuarioRepo.save(dado);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public ResponseEntity<?> updateUser(Integer id, JSONObject jsonObject) throws Exception {
        try {
            User user = userRepository.findById(id).orElseThrow();
            UserData userData = userDataRepository.findById(id).orElseThrow();
            updateUser(user, userData, jsonObject);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
