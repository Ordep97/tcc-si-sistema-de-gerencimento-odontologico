package tcc.si.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.List;
import java.util.Optional;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    @NotEmpty(message = "O nome deve ser preenchido")
    private String nome;

    @Column(name = "senha")
    @NotEmpty(message = "A senha deve ser preenchida")
    private String senha;

    @Column(name = "status")
    private Boolean status = true;

    private String tipoUsuario = "paciente";

    @OneToOne(cascade = CascadeType.ALL)
    private DadoUsuario dadoUsuario;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "USUARIO_has_CONCULTA",
                joinColumns = {@JoinColumn(name = "usuario_id")},
                inverseJoinColumns = {@JoinColumn(name = "consulta_id")})
    private List<Consulta> consultas;

    public Usuario(String nome, String senha, DadoUsuario dadoUsuario, Endereco endereco) {
        this.nome = nome;
        this.senha = senha;
        this.dadoUsuario = dadoUsuario;
        this.endereco = endereco;
    }

    public Usuario() {
    }

    public Integer getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public DadoUsuario getDadoUsuario() {
        return dadoUsuario;
    }

    public void setDadoUsuario(DadoUsuario dadoUsuario) {
        this.dadoUsuario = dadoUsuario;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }
}
