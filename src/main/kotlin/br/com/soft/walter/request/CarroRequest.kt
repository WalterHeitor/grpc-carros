package br.com.soft.walter.request

import javax.validation.constraints.NotBlank

data class CarroRequest(
    @field:NotBlank
    val modelo: String,
    @field:NotBlank
    val placa: String,
) {
}