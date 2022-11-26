package tcc.si.service;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import tcc.si.model.Endereco;
import tcc.si.model.Usuario;
import tcc.si.model.DadoUsuario;
import tcc.si.repository.DadoUsuarioRepository;
import tcc.si.repository.EnderecoRepository;
import tcc.si.repository.UserRepository;

import java.util.Date;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private DadoUsuarioRepository dadoUsuarioRepository;

    @Autowired
    private EnderecoRepository enderecoRepository;

    @Override
    public void updateUser(Usuario usuario, DadoUsuario dadoUsuario, Endereco endereco, JSONObject jsonObject) throws Exception {
        String telefone;
        String celular;
        String email;
        String estadoCivil;
        Date dataNascimento;
        String cpf;

        String bairro;
        String complemento;
        String logradouro;
        String estado;
        String municipio;



        try {
            telefone = (String) jsonObject.get("telefone");
            celular = (String) jsonObject.get("celular");
            estadoCivil = (String) jsonObject.get("estadoCivil");
            dataNascimento = (Date) jsonObject.get("dataNascimento");
            email = (String) jsonObject.get("email");
            bairro = (String) jsonObject.get("bairro");
            complemento = (String) jsonObject.get("complemento");
            logradouro = (String) jsonObject.get("logradouro");
            estado = (String) jsonObject.get("estado");
            municipio = (String) jsonObject.get("municipio");
            cpf = (String) jsonObject.get("cpf");




            dadoUsuario.setTelefone(telefone);
            dadoUsuario.setCelular(celular);
            dadoUsuario.setEstadoCivil(estadoCivil);
            dadoUsuario.setData_nasc(dataNascimento);
            dadoUsuario.setEmail(email);
            dadoUsuario.setCpf(cpf);

            endereco.setBairro(bairro);
            endereco.setComplemento(complemento);
            endereco.setLogradouro(logradouro);
            endereco.setEstado(estado);
            endereco.setMunicipio(municipio);

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
            Endereco endereco = enderecoRepository.findById(id).orElseThrow();
            updateUser(user, dadoUsuario, endereco, jsonObject);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }
}
