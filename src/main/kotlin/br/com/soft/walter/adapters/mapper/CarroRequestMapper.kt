package br.com.soft.walter.adapters.mapper

import br.com.soft.walter.GrpcCarrosRequest
import br.com.soft.walter.cadastro.doumaim.Carro
import br.com.soft.walter.request.CarroRequest

fun GrpcCarrosRequest.toCarro() : Carro{
    return Carro(
        modelo = this.modelo,
        placa = this.placa
    )
}