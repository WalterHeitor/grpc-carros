package br.com.soft.walter.adapters.mapper

import br.com.soft.walter.GrpcCarrosRequest
import br.com.soft.walter.usecase.doumaim.Carro

fun GrpcCarrosRequest.toCarro() : Carro {
    return Carro(
        modelo = this.modelo,
        placa = this.placa
    )
}