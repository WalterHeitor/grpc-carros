package br.com.soft.walter.usecase.ports.output

import br.com.soft.walter.cadastro.doumaim.Carro
import br.com.soft.walter.usecase.ports.input.FindCarroUseCase

interface CarroGateway : FindCarroUseCase {
    override fun findByCarroId(placa: String): Carro
}
