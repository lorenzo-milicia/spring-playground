package org.lorenzo.playground.springcontext

import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.AnnotationConfigApplicationContext

fun main() {
	val context: ApplicationContext = AnnotationConfigApplicationContext(SpringPlaygroundConfig::class.java)

	val service: ISpringPlaygroundService = context.getBean(ISpringPlaygroundService::class.java)

	service.doSomething()

	val otherComponent: SomeConfigDependency = context.getBean(SomeConfigDependency::class.java)

	otherComponent.printService()
}