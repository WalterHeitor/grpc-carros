package br.com.soft.walter.adapters;

import br.com.soft.walter.CarrosServiceGrpcKt;
import br.com.soft.walter.GrpcCarrosRequest;
import br.com.soft.walter.GrpcCarrosResponse;
import br.com.soft.walter.cadastro.doumaim.Carro;
import br.com.soft.walter.cadastro.exceptions.CarExistException;
import br.com.soft.walter.cadastro.exceptions.CarNotFoundException;
import br.com.soft.walter.repository.CarroRepository;
import br.com.soft.walter.usecase.ports.output.CarroGateway;
import io.grpc.Status;
import java.lang.Exception;
import javax.inject.Singleton;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lbr/com/soft/walter/adapters/CarroEndpoint;", "Lbr/com/soft/walter/CarrosServiceGrpcKt$CarrosServiceCoroutineImplBase;", "carroGateway", "Lbr/com/soft/walter/usecase/ports/output/CarroGateway;", "carroRepository", "Lbr/com/soft/walter/repository/CarroRepository;", "(Lbr/com/soft/walter/usecase/ports/output/CarroGateway;Lbr/com/soft/walter/repository/CarroRepository;)V", "adicionar", "Lbr/com/soft/walter/GrpcCarrosResponse;", "request", "Lbr/com/soft/walter/GrpcCarrosRequest;", "(Lbr/com/soft/walter/GrpcCarrosRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "grpc-carros"})
@javax.inject.Singleton()
public final class CarroEndpoint extends br.com.soft.walter.CarrosServiceGrpcKt.CarrosServiceCoroutineImplBase {
    private final br.com.soft.walter.usecase.ports.output.CarroGateway carroGateway = null;
    private final br.com.soft.walter.repository.CarroRepository carroRepository = null;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object adicionar(@org.jetbrains.annotations.NotNull()
    br.com.soft.walter.GrpcCarrosRequest request, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super br.com.soft.walter.GrpcCarrosResponse> p1) {
        return null;
    }
    
    public CarroEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.soft.walter.usecase.ports.output.CarroGateway carroGateway, @org.jetbrains.annotations.NotNull()
    br.com.soft.walter.repository.CarroRepository carroRepository) {
        super(null);
    }
}