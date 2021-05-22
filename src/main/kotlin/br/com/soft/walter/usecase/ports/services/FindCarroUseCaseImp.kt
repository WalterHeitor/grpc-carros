package br.com.soft.walter.usecase.ports.services

import br.com.soft.walter.cadastro.doumaim.Carro
import br.com.soft.walter.cadastro.exceptions.CarExistException
import br.com.soft.walter.cadastro.exceptions.CarNotFoundException
import br.com.soft.walter.repository.CarroRepository
import br.com.soft.walter.usecase.ports.output.CarroGateway
import javax.inject.Singleton

@Singleton
open class FindCarroUseCaseImp(private val carroRepository: CarroRepository):CarroGateway {
    override fun findByCarro(carro: Carro): Carro {
        val possivelCarro = carroRepository.findByPlaca(carro.placa)

            ?: throw CarNotFoundException()

        if (carroRepository.existsByPlaca(possivelCarro.get().placa)){
            println("car with ${possivelCarro.get().placa} plate already exists")
            throw CarExistException()
        }
        return possivelCarro.get()
    }


}
