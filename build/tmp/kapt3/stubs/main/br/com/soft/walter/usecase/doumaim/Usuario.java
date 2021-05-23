package br.com.soft.walter.usecase.doumaim;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\b\u00a8\u0006\u0010"}, d2 = {"Lbr/com/soft/walter/usecase/doumaim/Usuario;", "", "nome", "", "cpf", "email", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCpf", "()Ljava/lang/String;", "getEmail", "id", "", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getNome", "grpc-carros"})
@javax.persistence.Entity()
public final class Usuario {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @javax.persistence.Column(nullable = false)
    private final java.lang.String nome = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String cpf = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String email = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNome() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCpf() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEmail() {
        return null;
    }
    
    public Usuario(@org.jetbrains.annotations.NotNull()
    java.lang.String nome, @org.jetbrains.annotations.NotNull()
    java.lang.String cpf, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        super();
    }
}