package br.com.soft.walter.cadastro.doumaim

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
class Carro(
    @field:NotBlank
    @Column(nullable = false)
    val modelo: String,
    @field:NotBlank
    @Column(nullable = false)
    val placa: String,
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    override fun toString(): String {
        return "Carro(modelo='$modelo', placa='$placa', id=$id)"
    }

}