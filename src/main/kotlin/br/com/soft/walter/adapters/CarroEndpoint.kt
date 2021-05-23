package br.com.soft.walter.adapters

import br.com.soft.walter.CarrosServiceGrpcKt
import br.com.soft.walter.GrpcCarrosRequest
import br.com.soft.walter.GrpcCarrosResponse
import br.com.soft.walter.adapters.mapper.toCarro
import br.com.soft.walter.adapters.mapper.toResponse
import br.com.soft.walter.cadastro.doumaim.Carro
import br.com.soft.walter.cadastro.exceptions.CarExistException
import br.com.soft.walter.repository.CarroRepository
import br.com.soft.walter.usecase.ports.output.CarroGateway
import io.grpc.Status
import rx.plugins.RxJavaHooks.onError

import javax.inject.Singleton

@Singleton
class CarroEndpoint(
    private val carroGateway: CarroGateway,
    private val carroRepository: CarroRepository
) : CarrosServiceGrpcKt.CarrosServiceCoroutineImplBase() {
    override suspend fun adicionar(request: GrpcCarrosRequest): GrpcCarrosResponse {
        val carro = carroGateway.findByCarro(request.toCarro())
        println(carro)
        return carro!!.toResponse()

    }

}