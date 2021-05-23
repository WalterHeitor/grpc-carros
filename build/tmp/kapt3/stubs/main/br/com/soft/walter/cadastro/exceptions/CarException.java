package br.com.soft.walter.cadastro.exceptions;

import io.grpc.StatusRuntimeException;
import java.lang.RuntimeException;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lbr/com/soft/walter/cadastro/exceptions/CarException;", "Ljava/lang/RuntimeException;", "message", "", "status", "Lio/grpc/StatusRuntimeException;", "(Ljava/lang/String;Lio/grpc/StatusRuntimeException;)V", "getMessage", "()Ljava/lang/String;", "getStatus", "()Lio/grpc/StatusRuntimeException;", "grpc-carros"})
public abstract class CarException extends java.lang.RuntimeException {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final io.grpc.StatusRuntimeException status = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public io.grpc.StatusRuntimeException getStatus() {
        return null;
    }
    
    public CarException(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    io.grpc.StatusRuntimeException status) {
        super();
    }
}