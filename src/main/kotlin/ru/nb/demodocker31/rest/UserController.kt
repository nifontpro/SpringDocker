package ru.nb.demodocker31.rest

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.nb.demodocker31.db.UserEntity
import ru.nb.demodocker31.db.UserService

@RestController
class UserController(
	private val userService: UserService
) {

	@GetMapping("/all")
	fun getAll():List<UserEntity> {
		return userService.findAll()
	}

}