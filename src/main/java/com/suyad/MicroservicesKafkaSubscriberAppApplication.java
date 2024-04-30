package com.suyad;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;

import com.suyad.constants.AppConstants;

@SpringBootApplication
public class MicroservicesKafkaSubscriberAppApplication 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(MicroservicesKafkaSubscriberAppApplication.class, args);
		System.out.println("Apache Kafka Subscriber App has been started Successfully..........");
	}
	
	@KafkaListener(topics = AppConstants.Topic, groupId="group_ashokit_order")
	public void subscribeMsg(String order) 
	{
			System.out.print("*** Msg Recieved From Kafka *** :: ");
			System.out.println(order);
			// we can write logic to store msg in database also
	}

}
