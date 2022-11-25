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

    @Column(name = "paciente")
    private boolean paciente = true;

    @Column(name = "atendente")
    private boolean atendente = false;

    @Column(name = "admin")
    private boolean admin = false;

    @OneToOne(cascade = CascadeType.ALL)
    private DadoUsuario dadoUsuario;

    @ManyToOne(cascade = CascadeType.PERSIST)
    private Endereco userAdress;

    @OneToMany(cascade = CascadeType.ALL)
    private Consulta consulta;

    public Usuario(String nome, String senha, DadoUsuario dadoUsuario) {
        this.nome = nome;
        this.senha = senha;
        this.dadoUsuario = dadoUsuario;
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

    public DadoUsuario getdadoUsuario() {
        return dadoUsuario;
    }

    public void setdadoUsuario(DadoUsuario dadoUsuario) {
        this.dadoUsuario = dadoUsuario;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
