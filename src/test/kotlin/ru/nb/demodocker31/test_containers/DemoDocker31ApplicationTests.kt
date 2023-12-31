package ru.nb.demodocker31.test_containers

import jakarta.transaction.Transactional
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.testcontainers.junit.jupiter.Testcontainers
import ru.nb.demodocker31.db.UserEntity
import ru.nb.demodocker31.db.UserService

@SpringBootTest(classes = [TestBeans::class])
@AutoConfigureMockMvc
@Transactional
class DemoDocker31ApplicationTests(
	@Autowired private val userService: UserService,
) {

	@Test
	fun contextLoads() {
		val user = UserEntity(
			firstname = "Mama"
		)
		userService.insert(user)
		val users = userService.findAll()
		println(users)
	}

}
