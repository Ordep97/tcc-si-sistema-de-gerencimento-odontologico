package tcc.si.model;


import javax.persistence.*;

@Entity
@Table(name = "DENTISTA")
public class Dentista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column
    private String especializacao;

    @OneToOne(cascade = CascadeType.ALL)
    private Usuario user;
}
