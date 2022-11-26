package tcc.si.model;

import javax.persistence.*;

@Entity
@Table(name = "TIPO_USUARIO")
public class TipoUsuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "tipo")
    private String tipo = "paciente";

    public TipoUsuario(String tipo) {
        this.tipo = tipo;
    }

    public TipoUsuario() {
    }

    public Integer getId() {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
