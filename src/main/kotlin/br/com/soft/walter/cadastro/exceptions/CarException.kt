package br.com.soft.walter.cadastro.exceptions

import io.grpc.Status

abstract class CarException(
    override val message: String,
    open val status: Status = Status.INTERNAL
) : Throwable(message){
}