package Barbearia.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "barbeiro")

public class Barbeiro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "usuario_id", nullable = false, unique = true)
    private Usuario usuario;

    @Column(name = "nome_exibicao", nullable = false, length = 100)
    private String nomeExibicao;

    @Column(length = 500)
    private String foto;

    @Column(columnDefinition = "TEXT")
    private String descricao;

    @Column(nullable = false)
    private boolean ativo = true;

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
    public String getNomeExibicao() {
        return nomeExibicao;
    }
    public String getFoto() {
        return foto;
    }
    public String getDescricao() {
        return descricao;
    }

    public boolean isAtivo() {
        return ativo;
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
    public void setNomeExibicao(String nomeExibicao) {
        this.nomeExibicao = nomeExibicao;
    }
    public void setFoto(String foto) {
        this.foto = foto;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
