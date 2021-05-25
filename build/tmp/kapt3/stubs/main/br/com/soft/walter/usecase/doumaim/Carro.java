package br.com.soft.walter.usecase.doumaim;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0013\u001a\u00020\u0003H\u0016R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\u0014"}, d2 = {"Lbr/com/soft/walter/usecase/doumaim/Carro;", "", "modelo", "", "placa", "usuario", "", "Lbr/com/soft/walter/usecase/doumaim/Usuario;", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "id", "", "getId", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getModelo", "()Ljava/lang/String;", "getPlaca", "getUsuario", "()Ljava/util/List;", "toString", "grpc-carros"})
@javax.persistence.Entity()
public final class Carro {
    @org.jetbrains.annotations.Nullable()
    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.IDENTITY)
    @javax.persistence.Id()
    private final java.lang.Long id = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @javax.persistence.Column(nullable = false)
    private final java.lang.String modelo = null;
    @org.jetbrains.annotations.NotNull()
    @javax.validation.constraints.NotBlank()
    @javax.persistence.Column(nullable = false)
    private final java.lang.String placa = null;
    @org.jetbrains.annotations.NotNull()
    @javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, mappedBy = "carro")
    private final java.util.List<br.com.soft.walter.usecase.doumaim.Usuario> usuario = null;
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Long getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModelo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlaca() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<br.com.soft.walter.usecase.doumaim.Usuario> getUsuario() {
        return null;
    }
    
    public Carro(@org.jetbrains.annotations.NotNull()
    java.lang.String modelo, @org.jetbrains.annotations.NotNull()
    java.lang.String placa, @org.jetbrains.annotations.NotNull()
    java.util.List<br.com.soft.walter.usecase.doumaim.Usuario> usuario) {
        super();
    }
}