package tcc.si.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

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

    @ManyToOne(cascade = CascadeType.PERSIST)
    private TipoUsuario tipoUsuario;

    @OneToOne(cascade = CascadeType.ALL)
    private DadoUsuario dadoUsuario;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;

    @ManyToMany(cascade = CascadeType.PERSIST)
    private Consulta consulta;

    public Usuario(String nome, String senha, DadoUsuario dadoUsuario, Endereco endereco) {
        this.nome = nome;
        this.senha = senha;
        this.dadoUsuario = dadoUsuario;
        this.endereco = endereco;
    }

    public Usuario(String nome, String senha, TipoUsuario tipoUsuario, DadoUsuario dadoUsuario, Endereco endereco) {
        this.nome = nome;
        this.senha = senha;
        this.tipoUsuario = tipoUsuario;
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

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }
}
