package tcc.si.model;


import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data")
    private Date data;

    @ManyToMany(mappedBy = "consultas")
    private List<Usuario> pacientes;

    @Column(name = "observacao")
    private String observacao;

    public Consulta() {
    }

    public Consulta(Date data, List<Usuario> pacientes, String observacao) {
        this.data = data;
        this.pacientes = pacientes;
        this.observacao = observacao;
    }

    public Consulta(Date data, List<Usuario> pacientes) {
        this.data = data;
        this.pacientes = pacientes;
    }

    public int getId() {
        return id;
    }

    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern="dd/MM/yyyy HH:mm")
    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public List<Usuario> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Usuario> pacientes) {
        this.pacientes = pacientes;
    }
}
