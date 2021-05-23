package br.com.soft.walter.adapters.mapper

import br.com.soft.walter.GrpcCarrosResponse
import br.com.soft.walter.cadastro.doumaim.Carro

fun Carro.toResponse() : GrpcCarrosResponse{
    return GrpcCarrosResponse
        .newBuilder()
        .setId(this.id!!)
        .setPlaca(this.placa)
        .setModelo(this.placa)
        .build()
}