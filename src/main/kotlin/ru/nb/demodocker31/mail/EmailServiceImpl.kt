package ru.nb.demodocker31.mail

import org.apache.commons.mail.DefaultAuthenticator
import org.apache.commons.mail.SimpleEmail
import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service

@Service
class EmailServiceImpl(
	@Value("\${mail.username}") private val fromEmail: String,
	@Value("\${mail.host}") private val host: String,
	@Value("\${mail.port}") private val port: String,
	@Value("\${mail.password}") private val password: String,
) {

	fun sendMail(toEmail: String, message: String): Boolean {

		return try {
			SimpleEmail().apply {
				hostName = host
				setSmtpPort(port.toInt())
				setAuthenticator(DefaultAuthenticator(fromEmail, password))
				isSSLOnConnect = true
				setFrom(fromEmail)
//				subject = fromSubject
				subject = "Медалист"
				setMsg(message)
				addTo(toEmail)
				send()
			}
			true
		} catch (e: Exception) {
			println(e.message)
			false
		}
	}

}

