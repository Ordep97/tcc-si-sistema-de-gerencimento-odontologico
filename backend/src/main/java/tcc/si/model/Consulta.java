package tcc.si.model;


import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Table(name="consulta")
public class Consulta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "data")
    private Date data;

    @Column(name = "observacao")
    private String observacao;

    public Consulta() {
    }

    public Consulta(Date data, String observacao) {
        this.data = data;
        this.observacao = observacao;
    }

    public Consulta(Date data) {
        this.data = data;
    }

    public int getId() {
        return id;
    }

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
}
