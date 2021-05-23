package br.com.soft.walter.cadastro.exceptions

import io.grpc.Status


data class CarExistException(
    override val message: String = "Car exist",

 ) : CarException(message, Status.ALREADY_EXISTS.withDescription(message).asRuntimeException())