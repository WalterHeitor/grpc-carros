package br.com.soft.walter.usecase.ports.input

import br.com.soft.walter.cadastro.doumaim.Carro


interface FindCarroUseCase  {
     fun findByCarro(carro: Carro): Carro
}
