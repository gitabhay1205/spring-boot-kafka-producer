package com.boot.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.boot.kafka.model.User;

@RestController
public class UserController {
	
	@Autowired
	KafkaTemplate<String, String> kafkaTemplate;
	
	@Autowired
	KafkaTemplate<String, User> kafkaTemplateObj;
	
	static final String topic = "springProducerTopic";
	
	static final String jsonTopic = "springProducerJsonTopic";
	
	@GetMapping("/produceMsg/{message}")
	public String produceMessageString(@PathVariable("message")String message) 
	{
		kafkaTemplate.send(topic, message);
		return "Message Produced";
	}
	
	@GetMapping("/produceMsgObj/{name}")
	public String produceMessageObject(@PathVariable("name")String name) 
	{
		kafkaTemplateObj.send(jsonTopic, new User(name, "Technology", 1234));
		return "Message Produced";
	}


}
