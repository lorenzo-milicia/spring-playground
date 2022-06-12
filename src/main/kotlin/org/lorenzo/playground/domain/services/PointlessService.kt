package org.lorenzo.playground.domain.services

class PointlessService: ISpringPlaygroundService {

	override fun doSomething() {
		println("I'm a useless service that can't do anything...")
	}
}