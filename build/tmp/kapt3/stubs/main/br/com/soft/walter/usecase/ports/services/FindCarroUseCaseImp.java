package br.com.soft.walter.usecase.ports.services;

import br.com.soft.walter.cadastro.doumaim.Carro;
import br.com.soft.walter.cadastro.exceptions.CarExistException;
import br.com.soft.walter.cadastro.exceptions.CarNotFoundException;
import br.com.soft.walter.repository.CarroRepository;
import br.com.soft.walter.usecase.ports.output.CarroGateway;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lbr/com/soft/walter/usecase/ports/services/FindCarroUseCaseImp;", "Lbr/com/soft/walter/usecase/ports/output/CarroGateway;", "carroRepository", "Lbr/com/soft/walter/repository/CarroRepository;", "(Lbr/com/soft/walter/repository/CarroRepository;)V", "findByCarro", "Lbr/com/soft/walter/cadastro/doumaim/Carro;", "carro", "grpc-carros"})
@javax.inject.Singleton()
public class FindCarroUseCaseImp implements br.com.soft.walter.usecase.ports.output.CarroGateway {
    private final br.com.soft.walter.repository.CarroRepository carroRepository = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public br.com.soft.walter.cadastro.doumaim.Carro findByCarro(@org.jetbrains.annotations.NotNull()
    br.com.soft.walter.cadastro.doumaim.Carro carro) {
        return null;
    }
    
    public FindCarroUseCaseImp(@org.jetbrains.annotations.NotNull()
    br.com.soft.walter.repository.CarroRepository carroRepository) {
        super();
    }
}