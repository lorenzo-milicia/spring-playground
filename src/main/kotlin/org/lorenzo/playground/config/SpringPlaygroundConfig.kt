package org.lorenzo.playground.config

import org.lorenzo.playground.domain.services.ISpringPlaygroundService
import org.lorenzo.playground.domain.services.PointlessService
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
open class SpringPlaygroundConfig {

	@Bean
	open fun newSpringPlaygroundService(): ISpringPlaygroundService {
		return PointlessService()
	}
}