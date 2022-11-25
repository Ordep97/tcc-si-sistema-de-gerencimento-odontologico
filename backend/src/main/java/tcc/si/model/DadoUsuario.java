package tcc.si.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="dado_usuario")
public class DadoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data_nascimento")
    private Date data_nasc;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "sexo")
    private String sexo;

    @Column(name = "celular")
    private String celular;

    @Column(name = "telefone")
    private String telefone;

    @Column(name = "email")
    private String email;

    @Column(name = "estado_civil")
    private String estadoCivil;

    public DadoUsuario() {

    }

    public DadoUsuario(Date data_nasc, String cpf, String sexo, String celular, String telefone, String email, String estadoCivil) {
        this.data_nasc = data_nasc;
        this.cpf = cpf;
        this.sexo = sexo;
        this.celular = celular;
        this.telefone = telefone;
        this.email = email;
        this.estadoCivil = estadoCivil;
    }

    public int getId() {
        return id;
    }

    public Date getData_nasc() {
        return data_nasc;
    }

    public void setData_nasc(Date data_nasc) {
        this.data_nasc = data_nasc;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
