package br.com.soft.walter.usecase.ports.services

import br.com.soft.walter.cadastro.doumaim.Carro
import br.com.soft.walter.repository.CarroRepository
import br.com.soft.walter.usecase.ports.output.CarroGateway
import io.micronaut.context.annotation.Context

@Context
open class FindCarroUseCaseImp(private val carroRepository: CarroRepository):CarroGateway {
    override fun findByCarroId(placa: String): Carro {
        val possivelCarro = carroRepository.findByPlaca(placa)
        if (possivelCarro.isEmpty){
            println("carro nao encontrado")
        }
        return possivelCarro.get()
    }


}
