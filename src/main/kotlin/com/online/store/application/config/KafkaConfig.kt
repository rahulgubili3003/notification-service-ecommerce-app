package com.online.store.application.config


/*@Configuration
@EnableKafka*/
class KafkaConfig {

   /* @Bean
    fun kafkaListenerContainerFactory(): KafkaListenerContainerFactory<ConcurrentMessageListenerContainer<Int, OrderPlacedEvent>> {
        val factory =
            ConcurrentKafkaListenerContainerFactory<Int, OrderPlacedEvent>()
        factory.consumerFactory = consumerFactory()
        factory.setConcurrency(3)
        factory.containerProperties.pollTimeout = 3000
        return factory
    }

    @Bean
    fun consumerFactory(): ConsumerFactory<Int, OrderPlacedEvent> {
        return DefaultKafkaConsumerFactory(consumerConfigs())
    }

    @Bean
    fun consumerConfigs(): Map<String, Any> {
        val props = mutableMapOf<String, Any>()
        props[ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG] = "localhost:9090"
        props[ConsumerConfig.GROUP_ID_CONFIG] = "orderGroup"
        props[ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG] = StringDeserializer::class.java
        props[ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG] = JsonDeserializer::class.java
        // Add other configurations here...
        return props
    }
*/

}