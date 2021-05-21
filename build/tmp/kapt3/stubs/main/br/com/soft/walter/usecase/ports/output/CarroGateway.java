package br.com.soft.walter.usecase.ports.output;

import br.com.soft.walter.cadastro.doumaim.Carro;
import br.com.soft.walter.usecase.ports.input.FindCarroUseCase;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lbr/com/soft/walter/usecase/ports/output/CarroGateway;", "Lbr/com/soft/walter/usecase/ports/input/FindCarroUseCase;", "findByCarroId", "Lbr/com/soft/walter/cadastro/doumaim/Carro;", "placa", "", "grpc-carros"})
public abstract interface CarroGateway extends br.com.soft.walter.usecase.ports.input.FindCarroUseCase {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public abstract br.com.soft.walter.cadastro.doumaim.Carro findByCarroId(@org.jetbrains.annotations.NotNull()
    java.lang.String placa);
}