package br.com.soft.walter.usecase.ports.services

import br.com.soft.walter.cadastro.doumaim.Carro
import br.com.soft.walter.repository.CarroRepository
import br.com.soft.walter.usecase.ports.output.CarroGateway

open class FindCarroUseCaseImp(private val carroRepository: CarroRepository):CarroGateway {
    override fun findByCarroId(id: Long): Carro {
        val possivelCarro = carroRepository.findById(id)
        if (possivelCarro.isEmpty){
            println("carro nao encontrado")
        }
        return possivelCarro.get()
    }


}
