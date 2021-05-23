package br.com.soft.walter.usecase.ports.output

import br.com.soft.walter.usecase.doumaim.Carro
import br.com.soft.walter.usecase.ports.input.FindCarroUseCase

interface CarroGateway : FindCarroUseCase {
    override fun findByCarro(carro: Carro): Carro?
}
