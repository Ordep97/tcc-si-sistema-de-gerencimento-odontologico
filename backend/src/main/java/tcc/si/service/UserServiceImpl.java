package tcc.si.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tcc.si.model.Usuario;
import tcc.si.model.DadoUsuario;
import tcc.si.repository.DadoUsuarioRepository;
import tcc.si.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DadoUsuarioRepository dadoUsuarioRepository;

    @Override
    public void updateUser(Usuario usuario, DadoUsuario dadoUsuario, JSONObject jsonObject) throws Exception {
        String telefone;

        String email;
        String bairro;
        String complemento;
        String logradouro;
        String estado;

        String cidade;
        String cpf;


        try {
            telefone = (String) jsonObject.get("telefone");
            email = (String) jsonObject.get("email");
            bairro = (String) jsonObject.get("bairro");
            complemento = (String) jsonObject.get("complemento");
            logradouro = (String) jsonObject.get("logradouro");
            estado = (String) jsonObject.get("estado");
            cidade = (String) jsonObject.get("cidade");
            cpf = (String) jsonObject.get("cpf");




            dadoUsuario.setTelefone(telefone);
            dadoUsuario.setEmail(email);
            dadoUsuario.setBairro(bairro);
            dadoUsuario.setComplemento(complemento);
            dadoUsuario.setLogradouro(logradouro);
            dadoUsuario.setEstado(estado);
            dadoUsuario.setCidade(cidade);
            dadoUsuario.setCpf(cpf);

            dadoUsuarioRepository.save(dadoUsuario);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public ResponseEntity<?> updateDadoUsuario(Integer id, JSONObject jsonObject) throws Exception {
        try {
            Usuario user = userRepository.findById(id).orElseThrow();
            DadoUsuario dadoUsuario = dadoUsuarioRepository.findById(id).orElseThrow();
            updateUser(user, dadoUsuario, jsonObject);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
