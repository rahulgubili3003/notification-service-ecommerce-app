package com.online.store.application.repository

import com.online.store.application.entity.Notification
import org.springframework.data.mongodb.repository.MongoRepository

interface NotificationRepository: MongoRepository<Notification, Long> {
}