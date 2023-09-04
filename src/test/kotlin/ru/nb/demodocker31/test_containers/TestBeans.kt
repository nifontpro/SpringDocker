package ru.nb.demodocker31.test_containers
//
//import org.springframework.boot.fromApplication
//import org.springframework.boot.test.context.TestConfiguration
//import org.springframework.boot.testcontainers.service.connection.ServiceConnection
//import org.springframework.boot.with
//import org.springframework.context.annotation.Bean
//import org.testcontainers.containers.PostgreSQLContainer
//import org.testcontainers.utility.DockerImageName
//
//@TestConfiguration(proxyBeanMethods = false)
//class TestBeans {
//
//	@Bean
//	@ServiceConnection
//	fun postgresContainer(): PostgreSQLContainer<*> {
//		return PostgreSQLContainer(DockerImageName.parse("postgres:15"))
//	}
//
//}
//
//fun main(args: Array<String>) {
//	fromApplication<DemoDocker31Application>().with(TestBeans::class).run(*args)
//}
