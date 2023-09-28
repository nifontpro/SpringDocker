package ru.nb.demodocker31.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.nb.demodocker31.db.UserEntity
import ru.nb.demodocker31.db.UserService
import ru.nb.demodocker31.mail.EmailServiceImpl

@RestController
class UserController(
	private val userService: UserService,
	private val emailServiceImpl: EmailServiceImpl
) {

	@GetMapping("all")
	fun getAll():List<UserEntity> {
		return userService.findAll()
	}

	@GetMapping("test")
	fun test() = "Test data"

	@GetMapping("mail")
	fun sendEmail() {
		val ok =  emailServiceImpl.sendMail("nifontbus@yandex.ru", "Тестовое сообщение")
		println("OK: $ok")
	}

}