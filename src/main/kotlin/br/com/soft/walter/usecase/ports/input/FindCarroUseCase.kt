package br.com.soft.walter.usecase.ports.input

import br.com.soft.walter.usecase.doumaim.Carro


interface FindCarroUseCase  {
     fun findByCarro(carro: Carro): Carro?
}
