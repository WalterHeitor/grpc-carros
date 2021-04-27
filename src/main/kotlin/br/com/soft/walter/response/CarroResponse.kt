package br.com.soft.walter.response

import javax.validation.constraints.NotBlank

data class CarroResponse(
    @field:NotBlank
    val modelo: String,
    @field:NotBlank
    val placa: String,
    val id: Long
) {
}