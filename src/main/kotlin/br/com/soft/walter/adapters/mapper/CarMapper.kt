package br.com.soft.walter.adapters.mapper

import br.com.soft.walter.GrpcCarrosResponse
import br.com.soft.walter.cadastro.doumaim.Carro

fun GrpcCarrosResponse.toCarro() : Carro{
    return Carro(
        modelo = this.modelo,
        placa = this.placa
    )
}