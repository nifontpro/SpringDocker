package ru.nb.demodocker31.db

import jakarta.persistence.*

@Entity
@Table(name = "usr", schema = "usr", catalog = "my_db")
class UserEntity(
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	val id: Long? = null,
	val firstname: String? = null
) {
	override fun toString(): String {
		return "{id: $id, firstname: $firstname}"
	}
}