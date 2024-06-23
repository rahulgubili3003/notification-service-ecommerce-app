package com.online.store.application.controller

import com.online.store.application.entity.Notification
import com.online.store.application.repository.NotificationRepository
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1")
class NotificationController(private val notificationRepository: NotificationRepository) {

    @PostMapping("/save")
    fun createNotification() {
       val notification = Notification()
        notificationRepository.save(notification)
    }
}