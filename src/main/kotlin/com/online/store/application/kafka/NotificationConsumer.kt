package com.online.store.application.kafka

import com.online.store.application.kafka.dto.OrderPlacedEvent
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class NotificationConsumer {

    private val log = LoggerFactory.getLogger(javaClass)

    @KafkaListener(topics = ["orders-topic"])
    fun consumeOrderCompleteMessages(orderPlacedEvent: OrderPlacedEvent) {
        log.info("Consuming Messages: $orderPlacedEvent")
    }
}