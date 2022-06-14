package org.lorenzo.playground.springcontext

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class SomeConfigDependency {

	@Autowired
	private lateinit var service: ISpringPlaygroundService

	fun printService() {
		println("My service's name is $service")
	}
}