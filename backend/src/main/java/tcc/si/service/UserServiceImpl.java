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

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    public String getSenhaUser(Integer id) throws Exception{
        try {
            Usuario user = userRepository.findById(id).orElseThrow(() -> new Exception("Usuário não existe - "));
            return user.getSenha();
        }catch(Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public void UpdateUser(Usuario usuario, DadoUsuario dadoUsuario, Endereco endereco, JSONObject jsonObject) throws Exception {
        String nome;
        String senha;
        String tipo;

        String telefone;
        String celular;
        String email;
        String estadoCivil;
        Date dataNascimento;
        String cpf;
        String sexo;

        String bairro;
        String complemento;
        String logradouro;
        String estado;
        String municipio;
        String cep;
        String pais;



        try {
            nome = (String) jsonObject.get("nome");
            senha = (String) jsonObject.get("senha");
            tipo = (String) jsonObject.get("tipo");

            telefone = (String) jsonObject.get("telefone");
            celular = (String) jsonObject.get("celular");
            email = (String) jsonObject.get("email");
            estadoCivil = (String) jsonObject.get("estadoCivil");
            DateFormat simpleDateFormat= new SimpleDateFormat("dd/MM/yyyy");
            dataNascimento = (Date) simpleDateFormat.parse((String) jsonObject.get("dataNascimento"));
            cpf = (String) jsonObject.get("cpf");
            sexo = (String) jsonObject.get("sexo");

            bairro = (String) jsonObject.get("bairro");
            complemento = (String) jsonObject.get("complemento");
            logradouro = (String) jsonObject.get("logradouro");
            estado = (String) jsonObject.get("estado");
            municipio = (String) jsonObject.get("municipio");
            cep = (String) jsonObject.get("cep");
            pais = (String) jsonObject.get("pais");

            usuario.setNome(nome);
            usuario.setSenha(senha);
            usuario.setTipoUsuario(tipo);

            dadoUsuario.setTelefone(telefone);
            dadoUsuario.setCelular(celular);
            dadoUsuario.setEstadoCivil(estadoCivil);
            dadoUsuario.setDataNascimento(dataNascimento);
            dadoUsuario.setEmail(email);
            dadoUsuario.setCpf(cpf);
            dadoUsuario.setSexo(sexo);

            endereco.setBairro(bairro);
            endereco.setComplemento(complemento);
            endereco.setLogradouro(logradouro);
            endereco.setEstado(estado);
            endereco.setMunicipio(municipio);
            endereco.setCep(cep);
            endereco.setPais(pais);

            userRepository.save(usuario);
            dadoUsuarioRepository.save(dadoUsuario);
            enderecoRepository.save(endereco);
        } catch (Exception e) {
            throw new Exception(e);
        }
    }

    @Override
    public ResponseEntity<?> rpUpdateUser(Integer id, JSONObject jsonObject) throws Exception {
        try {
            Usuario user = userRepository.findById(id).orElseThrow(() -> new Exception("Usuário não existe - "));
            DadoUsuario dadoUsuario = dadoUsuarioRepository.findById(user.getDadoUsuario().getId()).orElseThrow(() -> new Exception("Dados do Usuario não existem"));
            Endereco endereco = enderecoRepository.findById(user.getEndereco().getId()).orElseThrow(() -> new Exception("Endereco não existe"));
            UpdateUser(user, dadoUsuario, endereco, jsonObject);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            throw new Exception(e);
        }

    }
}
