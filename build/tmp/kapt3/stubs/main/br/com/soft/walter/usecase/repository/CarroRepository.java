package br.com.soft.walter.usecase.repository;

import br.com.soft.walter.usecase.doumaim.Carro;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jpa.repository.JpaRepository;
import java.util.*;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lbr/com/soft/walter/usecase/repository/CarroRepository;", "Lio/micronaut/data/jpa/repository/JpaRepository;", "Lbr/com/soft/walter/usecase/doumaim/Carro;", "", "existsByPlaca", "", "placa", "", "findByPlaca", "Ljava/util/Optional;", "grpc-carros"})
@io.micronaut.data.annotation.Repository()
public abstract interface CarroRepository extends io.micronaut.data.jpa.repository.JpaRepository<br.com.soft.walter.usecase.doumaim.Carro, java.lang.Long> {
    
    public abstract boolean existsByPlaca(@org.jetbrains.annotations.Nullable()
    java.lang.String placa);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Optional<br.com.soft.walter.usecase.doumaim.Carro> findByPlaca(@org.jetbrains.annotations.NotNull()
    java.lang.String placa);
}