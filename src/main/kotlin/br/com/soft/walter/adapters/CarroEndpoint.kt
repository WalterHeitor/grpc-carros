package br.com.soft.walter.adapters

import br.com.soft.walter.CarrosServiceGrpcKt
import br.com.soft.walter.GrpcCarrosRequest
import br.com.soft.walter.GrpcCarrosResponse
import br.com.soft.walter.usecase.ports.output.CarroGateway
import javax.inject.Singleton

@Singleton
class CarroEndpoint(
    private val carroGateway: CarroGateway,
) : CarrosServiceGrpcKt.CarrosServiceCoroutineImplBase() {
    override suspend fun adicionar(request: GrpcCarrosRequest): GrpcCarrosResponse {
        var carro = carroGateway.findByCarroId(request.placa)
        return GrpcCarrosResponse.newBuilder()
            .setId(carro.id!!)
            .setPlaca(carro.placa)
            .setModelo(carro.modelo)
            .build()
    }
}