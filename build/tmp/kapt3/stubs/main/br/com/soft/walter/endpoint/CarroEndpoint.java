package br.com.soft.walter.endpoint;

import br.com.soft.walter.CarrosServiceGrpc;
import br.com.soft.walter.GrpcCarrosRequest;
import br.com.soft.walter.GrpcCarrosResponse;
import br.com.soft.walter.cadastro.doumaim.Carro;
import br.com.soft.walter.repository.CarroRepository;
import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import javax.inject.Inject;
import javax.inject.Singleton;
import javax.validation.ConstraintViolationException;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000e"}, d2 = {"Lbr/com/soft/walter/endpoint/CarroEndpoint;", "Lbr/com/soft/walter/CarrosServiceGrpc$CarrosServiceImplBase;", "carroRepository", "Lbr/com/soft/walter/repository/CarroRepository;", "(Lbr/com/soft/walter/repository/CarroRepository;)V", "getCarroRepository", "()Lbr/com/soft/walter/repository/CarroRepository;", "adicionar", "", "request", "Lbr/com/soft/walter/GrpcCarrosRequest;", "responseObserver", "Lio/grpc/stub/StreamObserver;", "Lbr/com/soft/walter/GrpcCarrosResponse;", "grpc-carros"})
@javax.inject.Singleton()
public final class CarroEndpoint extends br.com.soft.walter.CarrosServiceGrpc.CarrosServiceImplBase {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    private final br.com.soft.walter.repository.CarroRepository carroRepository = null;
    
    @java.lang.Override()
    public void adicionar(@org.jetbrains.annotations.NotNull()
    br.com.soft.walter.GrpcCarrosRequest request, @org.jetbrains.annotations.NotNull()
    io.grpc.stub.StreamObserver<br.com.soft.walter.GrpcCarrosResponse> responseObserver) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final br.com.soft.walter.repository.CarroRepository getCarroRepository() {
        return null;
    }
    
    public CarroEndpoint(@org.jetbrains.annotations.NotNull()
    br.com.soft.walter.repository.CarroRepository carroRepository) {
        super();
    }
}