package ru.nb.demodocker31.test_containers

import jakarta.transaction.Transactional
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import ru.nb.demodocker31.db.UserService

@SpringBootTest(classes = [TestBeans::class])
//@Testcontainers
@AutoConfigureMockMvc
@Transactional
class DemoDocker31ApplicationTests(
	@Autowired private val userService: UserService,
	@Autowired private val mockMvc: MockMvc
) {

//	companion object {
//		@Container
//		@ServiceConnection
//		val postgreSQLContainer = PostgreSQLContainer("postgres:15")
//	}

	@Test
	fun contextLoads() {
		val data = mockMvc.get("/all")
		data.andExpect {
		}
		println(data)
		val users = userService.findAll()
		println(users)
	}

}
