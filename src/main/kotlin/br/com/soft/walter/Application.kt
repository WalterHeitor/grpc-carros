package br.com.soft.walter

import io.micronaut.runtime.Micronaut.*
fun main(args: Array<String>) {
	build()
	    .args(*args)
		.packages("br.com.soft.walter")
		.start()
}

