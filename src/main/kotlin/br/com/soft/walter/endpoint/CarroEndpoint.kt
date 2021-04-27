package br.com.soft.walter.endpoint

import br.com.soft.walter.GrpcCarrosRequest
import br.com.soft.walter.GrpcCarrosResponse
import br.com.soft.walter.GrpcCarrosServiceGrpc
import br.com.soft.walter.cadastro.doumaim.Carro
import br.com.soft.walter.repository.CarroRepository
import br.com.soft.walter.response.CarroResponse
import io.grpc.Status
import io.grpc.stub.StreamObserver
import org.hibernate.exception.ConstraintViolationException
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class CarroEndpoint(@Inject val carroRepository: CarroRepository) : GrpcCarrosServiceGrpc.GrpcCarrosServiceImplBase() {
    override fun adicionar(
        request: GrpcCarrosRequest,
        responseObserver: StreamObserver<GrpcCarrosResponse>,
    ) {
        if (carroRepository.existsByPlaca(request.placa)){
            responseObserver.onError(Status.ALREADY_EXISTS
                .withDescription("carro com placa existente")
                .asRuntimeException())
            return
        }
        val carro = Carro(
            modelo = request.modelo,
            placa = request.placa
        )
        try {
            carroRepository.save(carro)
        }catch (e: ConstraintViolationException){
            responseObserver.onError(Status.INVALID_ARGUMENT
                .withDescription("dados de entrada invalidos.")
                .asRuntimeException())
        }
        responseObserver.onNext(GrpcCarrosResponse.newBuilder()
            .setId(carro.id!!)
            .setModelo(carro.modelo)
            .setPlaca(carro.placa)
            .build())
        responseObserver.onCompleted()
    }
}