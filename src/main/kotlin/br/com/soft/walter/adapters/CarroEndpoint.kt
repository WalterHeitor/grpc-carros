package br.com.soft.walter.adapters

import br.com.soft.walter.CarrosServiceGrpcKt
import br.com.soft.walter.GrpcCarrosRequest
import br.com.soft.walter.GrpcCarrosResponse
import br.com.soft.walter.usecase.ports.output.CarroGateway


class CarroEndpoint(
    private val carroGateway: CarroGateway,
) : CarrosServiceGrpcKt.CarrosServiceCoroutineImplBase() {
    override suspend fun adicionar(request: GrpcCarrosRequest): GrpcCarrosResponse {
        return super.adicionar(request)
    }
}