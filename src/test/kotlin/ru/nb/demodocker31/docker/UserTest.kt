package ru.nb.demodocker31.docker

import jakarta.transaction.Transactional
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import ru.nb.demodocker31.db.UserService

@SpringBootTest
@Transactional
class UserTest(
	@Autowired private val userService: UserService
) {

	@Test
	fun getAll() {
		val data = userService.findAll()
		println(data)
	}

}