package com.narender.KafkaUtil.KafkaUtility;

import com.narender.KafkaUtil.KafkaUtility.Event.Event;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Properties;

@SpringBootApplication
public class KafkaUtilityApplication {

	public KafkaUtilityApplication() throws UnknownHostException, InterruptedException {
		int c = 0;
		/*for(int i=0;i<1000;i++) {
			c++;
			System.out.println(c + "  --  Narender");
		}*/


		Properties config = new Properties();
		config.put("client.id", InetAddress.getLocalHost().getHostName());
		config.put("bootstrap.servers", "localhost:9092");
		config.put("acks", "all");
		config.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		config.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
		KafkaProducer<String, String> producer = new KafkaProducer<>(config);

		for(int i=0;i<100;i++) {
			String k = String.valueOf(i);
			String event = new Event("UserName", i).toString();
			ProducerRecord record = new ProducerRecord<String, String>("TestTopic1", k, event);
			producer.send(record);
			Thread.sleep(1000);
		}
	}

	public static void main(String[] args) {
		SpringApplication.run(KafkaUtilityApplication.class, args);
	}

	}
