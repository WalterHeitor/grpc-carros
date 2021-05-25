package br.com.soft.walter.usecase.doumaim

import br.com.soft.walter.adapters.mapper.toResponse
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class CarroTest {

    val ususarios = listOf(Usuario(nome = "Walter", cpf = "0101", email = "walter@email"))
    val carro = Carro(modelo = "Vectra", placa = "0101", usuario = ususarios)

    @Test
    fun `shold get Car`(){
        val expected = carro
        assertEquals(expected.id, carro.id)
        assertEquals(expected.modelo, carro.modelo)
        assertEquals(expected.placa, carro.placa)
        assertEquals(expected.usuario.size, carro.usuario.size)
        assertEquals(expected.usuario[0].id, carro.usuario[0].id)
        assertEquals(expected.usuario[0].nome, carro.usuario[0].nome)
        assertEquals(expected.usuario[0].cpf, carro.usuario[0].cpf)
        assertEquals(expected.usuario[0].email, carro.usuario[0].email)
        assertEquals(expected.toString(), carro.toString())
//        assertEquals(expected.toResponse(), carro.toResponse())


    }
}