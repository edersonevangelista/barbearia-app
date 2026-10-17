package Barbearia.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity // Define que esta classe é uma entidade JPA (mapeada para o banco)
@Table(name = "usuario") // Especifica o nome da tabela no banco


public class Usuario {

    @Id //Define que este campo é a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) //Define o auto-incremento do ID
    private Long id;

    @Column(nullable = false, length = 100) //Configura a coluna correspondente
    private String nome;

    @Column(nullable = false, length = 100, unique = true)
    private String email;

    @Column(nullable = false, length = 255)
    private String senha;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoUsuario tipo;

    @Column(nullable = false)
    private boolean ativo = true;

    @Column(name = "criado_em", insertable = false, updatable = false)
    private LocalDateTime criadoEm;

    @Column(name = "atualizado_em", insertable = false, updatable = false)
    private LocalDateTime atualizadoEm;

    public enum TipoUsuario {
        CLIENTE,
        BARBEIRO
    }

    //Getters
    public Long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }
    public String getEmail() {
        return email;
    }
    public String getSenha() {
        return senha;
    }
    public TipoUsuario getTipo() {
        return tipo;
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
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public void setTipo(TipoUsuario tipo) {
        this.tipo = tipo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
