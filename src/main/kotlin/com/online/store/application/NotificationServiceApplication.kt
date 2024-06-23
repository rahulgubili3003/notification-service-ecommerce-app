package com.online.store.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.kafka.annotation.EnableKafka

@SpringBootApplication
@EnableKafka
class NotificationServiceApplication

fun main(args: Array<String>) {
	runApplication<NotificationServiceApplication>(*args)
}
