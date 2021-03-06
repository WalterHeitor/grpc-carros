package br.com.soft.walter.usecase.exceptions

import io.grpc.Status

data class CarNotFoundException(
    override val message: String = "Car not found"
) : CarException(message, Status.NOT_FOUND.asRuntimeException())
