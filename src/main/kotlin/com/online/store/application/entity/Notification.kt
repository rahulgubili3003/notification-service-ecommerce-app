package com.online.store.application.entity

import jakarta.persistence.Id
import org.springframework.data.mongodb.core.mapping.Document


@Document(collection = "notifications")
data class Notification(
    @Id val id: Long? = null
)
