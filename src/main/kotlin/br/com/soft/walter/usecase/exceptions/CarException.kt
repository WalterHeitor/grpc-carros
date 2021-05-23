package br.com.soft.walter.usecase.exceptions

import io.grpc.StatusRuntimeException
import java.lang.RuntimeException

abstract class CarException(
    override val message: String,
    open val status: StatusRuntimeException
) : RuntimeException(message, status)