package br.com.soft.walter.usecase.doumaim

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
class Usuario(
    @field:NotBlank
    @Column(nullable = false)
    val nome: String,
    val cpf: String,
    val email: String,
    @field:ManyToOne
    val carro: Carro?

) {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
}