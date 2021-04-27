package br.com.soft.walter.repository

import br.com.soft.walter.cadastro.doumaim.Carro
import io.micronaut.data.jpa.repository.JpaRepository

interface CarroRepository : JpaRepository<Carro, Long> {
    fun existsByPlaca(placa: String?): Boolean
}