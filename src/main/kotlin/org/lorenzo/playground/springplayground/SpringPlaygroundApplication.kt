package org.lorenzo.playground.springplayground

import org.lorenzo.playground.config.SpringPlaygroundConfig
import org.lorenzo.playground.domain.services.ISpringPlaygroundService
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
	val context: ApplicationContext = AnnotationConfigApplicationContext(SpringPlaygroundConfig::class.java)

	val service: ISpringPlaygroundService = context.getBean(ISpringPlaygroundService::class.java)

	service.doSomething()
}