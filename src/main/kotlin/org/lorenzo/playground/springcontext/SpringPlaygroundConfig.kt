package org.lorenzo.playground.springcontext

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration

@Configuration
@ComponentScan
open class SpringPlaygroundConfig {

	@Bean
	open fun newSpringPlaygroundService(): ISpringPlaygroundService {
		return PointlessService()
	}
}