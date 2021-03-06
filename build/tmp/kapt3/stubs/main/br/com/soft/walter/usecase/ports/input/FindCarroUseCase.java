package br.com.soft.walter.usecase.ports.input;

import br.com.soft.walter.usecase.doumaim.Carro;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lbr/com/soft/walter/usecase/ports/input/FindCarroUseCase;", "", "findByCarro", "Lbr/com/soft/walter/usecase/doumaim/Carro;", "carro", "grpc-carros"})
public abstract interface FindCarroUseCase {
    
    @org.jetbrains.annotations.Nullable()
    public abstract br.com.soft.walter.usecase.doumaim.Carro findByCarro(@org.jetbrains.annotations.NotNull()
    br.com.soft.walter.usecase.doumaim.Carro carro);
}