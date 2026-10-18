package Barbearia.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "cliente")

public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false, unique = true)
    private Usuario usuario;

    @Column(nullable = false, length = 20)
    private String telefone;

    @Column(name = "criado_em", insertable = false, updatable = false)
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em", insertable = false, updatable = false)
    private LocalDateTime atualizadoEm;

    //Getters
    public Long getId() {
        return id;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public String getTelefone() {
        return telefone;
    }
    public LocalDateTime getCriadoEm() {
        return criadoEm;
    }
    public LocalDateTime getAtualizadoEm() {
        return atualizadoEm;
    }

    //Setters
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
