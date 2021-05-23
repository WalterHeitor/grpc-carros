package br.com.soft.walter.usecase.doumaim

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
    @field:OneToMany(cascade = [CascadeType.ALL])
    val usuario: List<Usuario>
) {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null
    override fun toString(): String {
        return "Carro(modelo='$modelo', placa='$placa', id=$id)"
    }

}