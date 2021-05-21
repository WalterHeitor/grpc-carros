package br.com.soft.walter.usecase.ports.services;

import br.com.soft.walter.cadastro.doumaim.Carro;
import br.com.soft.walter.repository.CarroRepository;
import br.com.soft.walter.usecase.ports.output.CarroGateway;
import io.micronaut.context.annotation.Context;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lbr/com/soft/walter/usecase/ports/services/FindCarroUseCaseImp;", "Lbr/com/soft/walter/usecase/ports/output/CarroGateway;", "carroRepository", "Lbr/com/soft/walter/repository/CarroRepository;", "(Lbr/com/soft/walter/repository/CarroRepository;)V", "findByCarroId", "Lbr/com/soft/walter/cadastro/doumaim/Carro;", "placa", "", "grpc-carros"})
@io.micronaut.context.annotation.Context()
public class FindCarroUseCaseImp implements br.com.soft.walter.usecase.ports.output.CarroGateway {
    private final br.com.soft.walter.repository.CarroRepository carroRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.soft.walter.cadastro.doumaim.Carro findByCarroId(@org.jetbrains.annotations.NotNull()
    java.lang.String placa) {
        return null;
    }
    
    public FindCarroUseCaseImp(@org.jetbrains.annotations.NotNull()
    br.com.soft.walter.repository.CarroRepository carroRepository) {
        super();
    }
}