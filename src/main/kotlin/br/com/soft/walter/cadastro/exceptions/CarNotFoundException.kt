package br.com.soft.walter.cadastro.exceptions

import io.grpc.Status

data class CarNotFoundException(
    override val message: String = "Car not found"
) : CarException(message, Status.INVALID_ARGUMENT)
