package br.com.soft.walter.usecase.ports.services

import br.com.soft.walter.usecase.doumaim.Carro
import br.com.soft.walter.usecase.exceptions.CarExistException
import br.com.soft.walter.usecase.repository.CarroRepository
import br.com.soft.walter.usecase.ports.output.CarroGateway
import javax.inject.Singleton

@Singleton
open class FindCarroUseCaseImp(private val carroRepository: CarroRepository):CarroGateway {
    override fun findByCarro(carro: Carro): Carro? {
        println("carro 1 $carro")
        val possivelCarro = carroRepository.findByPlaca(carro.placa)
        if (!possivelCarro.isEmpty){
            println("carro 2 $carro")
            println("car with ${possivelCarro.get().placa} plate already exists")
            throw CarExistException("car with ${possivelCarro.get().placa} plate already exists")
        }
        println("--------- carro 3 $carro")
        println("---- $possivelCarro")
        carroRepository.save(carro)
        println("--------- carro 4 $carro")
        return carro
    }
}
