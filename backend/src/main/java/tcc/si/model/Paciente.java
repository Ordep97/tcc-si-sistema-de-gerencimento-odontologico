package tcc.si.model;

import javax.persistence.*;

@Entity
@Table(name = "PACIENTE")
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
}
