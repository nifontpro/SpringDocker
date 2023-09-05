package ru.nb.demodocker31.test_containers

import org.springframework.boot.fromApplication
import org.springframework.boot.with
import ru.nb.demodocker31.DemoDocker31Application

fun main(args: Array<String>) {
	fromApplication<DemoDocker31Application>().with(TestBeans::class).run(*args)
}


