package br.com.soft.walter.repository

import br.com.soft.walter.cadastro.doumaim.Carro
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface CarroRepository : JpaRepository<Carro, Long> {
    fun existsByPlaca(placa: String?): Boolean
    abstract fun findByPlaca(placa: String): Optional<Carro>
}