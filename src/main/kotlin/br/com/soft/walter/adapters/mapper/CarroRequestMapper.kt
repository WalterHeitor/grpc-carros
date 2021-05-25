package br.com.soft.walter.adapters.mapper

import br.com.soft.walter.GrpcCarrosRequest
import br.com.soft.walter.GrpcUsuario
import br.com.soft.walter.usecase.doumaim.Carro
import br.com.soft.walter.usecase.doumaim.Usuario

fun GrpcCarrosRequest.toCarro() : Carro {
    return Carro(
        modelo = this.modelo,
        placa = this.placa,
        usuario = this.usuariosList.map { it.toUsuario() }
    )
}
fun GrpcUsuario.toUsuario() : Usuario{
    return Usuario(
        nome = this.nome,
        cpf = this.cpf,
        email = this.email,
        carro = null
    )
}