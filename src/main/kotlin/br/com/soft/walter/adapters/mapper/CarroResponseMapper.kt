package br.com.soft.walter.adapters.mapper

import br.com.soft.walter.GrpcCarrosResponse
import br.com.soft.walter.GrpcUsuario
import br.com.soft.walter.usecase.doumaim.Carro
import br.com.soft.walter.usecase.doumaim.Usuario

fun Carro.toResponse() : GrpcCarrosResponse{
    return GrpcCarrosResponse
        .newBuilder()
        .setId(this.id!!)
        .setPlaca(this.placa)
        .setModelo(this.modelo)
        .addAllUsuarios(this.usuario.map { it.toResponse() })
        .build()
}
fun Usuario.toResponse() : GrpcUsuario{
    return GrpcUsuario
        .newBuilder()
        .setNome(this.nome)
        .setCpf(this.cpf)
        .setEmail(this.email)
        .build()
}