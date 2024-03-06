package com.narender.KafkaUtil.KafkaUtility;

import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

@SpringBootApplication
public class KafkaUtilityApplication {

	public KafkaUtilityApplication() throws UnknownHostException {
		int c = 0;
		/*for(int i=0;i<1000;i++) {
			c++;
			System.out.println(c + "  --  Narender");
		}*/


		Properties config = new Properties();
		config.put("client.id", InetAddress.getLocalHost().getHostName());
		config.put("bootstrap.servers", "localhost:9092");
		config.put("acks", "all");
		config.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		config.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
		config.put("group.id", "consumer2");
		//KafkaProducer<String, String> producer = new KafkaProducer<>(config);
		KafkaConsumer<String, String> consumer = new KafkaConsumer<>(config);
		consumer.subscribe(Collections.singleton("TestTopic1"));

		int i=0;
		while (true) {
			i++;
			ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(100));
			process(records, i); // application-specific processing
			consumer.commitSync();

		}
	}

	private void process(ConsumerRecords<String, String> records, int i) {
		System.out.print(i + "  --  ");
		System.out.println(records);
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaUtilityApplication.class, args);
	}

	}


