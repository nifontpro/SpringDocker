package ru.nb.demodocker31.test_containers

import jakarta.transaction.Transactional
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.testcontainers.service.connection.ServiceConnection
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.testcontainers.containers.PostgreSQLContainer
import org.testcontainers.junit.jupiter.Container
import org.testcontainers.junit.jupiter.Testcontainers
import ru.nb.demodocker31.db.UserService

@SpringBootTest
@Testcontainers
@AutoConfigureMockMvc
@Transactional
class TestContainerMain(
	@Autowired private val userService: UserService,
) {

	companion object {
		@Container
		@ServiceConnection
		val postgreSQLContainer = PostgreSQLContainer(/* dockerImageName = */ "postgres:15")
	}

	@Test
	fun contextLoads() {
		val users = userService.findAll()
		println(users)
	}

}
