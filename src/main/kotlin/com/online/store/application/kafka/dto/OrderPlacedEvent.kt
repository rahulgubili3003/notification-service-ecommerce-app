package com.online.store.application.kafka.dto

data class OrderPlacedEvent(
    val orderId: Long? = null,
    val orderPlaced: Boolean = true,
    val orderPlacedTime: Long = System.currentTimeMillis()
)
