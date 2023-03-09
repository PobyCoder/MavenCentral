package com.example.mct

import com.example.mct.module.TestModule
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MctApplication

fun main(args: Array<String>) {
	var test = TestModule()
	test.hello()
	runApplication<MctApplication>(*args)
}
