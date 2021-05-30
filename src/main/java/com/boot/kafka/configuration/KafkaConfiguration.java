//package com.boot.kafka.configuration;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.apache.kafka.clients.producer.ProducerConfig;
//import org.apache.kafka.common.serialization.StringSerializer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.kafka.core.DefaultKafkaProducerFactory;
//import org.springframework.kafka.core.KafkaTemplate;
//import org.springframework.kafka.core.ProducerFactory;
//import org.springframework.kafka.support.serializer.JsonSerializer;
//
//import com.boot.kafka.model.User;
//
///*This class is created, to configure KafkaTemplate to accept 
// * Object as value(like User object),
//but instead of using this class we can also use property from spring
// kafka, like we did in applicaion.properties*/
//
//
//@Configuration
//public class KafkaConfiguration {
//	
//	@Bean
//	public ProducerFactory<String,User> producerFactory()
//	{
//		Map<String, Object> configs = new HashMap<>();
//		configs.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "127.0.0.1:9092");
//		configs.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
//		configs.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, JsonSerializer.class);
//		
//		return new DefaultKafkaProducerFactory<String, User>(configs);
//	}
//	
//	@Bean
//	public KafkaTemplate<String, User> kafkaTemplate()
//	{
//		return new KafkaTemplate<String, User>(producerFactory());
//	}
//
//}
