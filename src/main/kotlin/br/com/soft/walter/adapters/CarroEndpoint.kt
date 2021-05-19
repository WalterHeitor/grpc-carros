package br.com.soft.walter.adapters

import br.com.soft.walter.CarrosServiceGrpc
import br.com.soft.walter.CarrosServiceGrpcKt
import br.com.soft.walter.GrpcCarrosRequest
import br.com.soft.walter.GrpcCarrosResponse
import io.grpc.Channel


class CarroEndpoint(
    channel: Channel
    // private val carroGateway: CarroGetaway
) : CarrosServiceGrpcKt.CarrosServiceCoroutineImplBase() {
    override suspend fun adicionar(request: GrpcCarrosRequest): GrpcCarrosResponse {
        return super.adicionar(request)
    }
}