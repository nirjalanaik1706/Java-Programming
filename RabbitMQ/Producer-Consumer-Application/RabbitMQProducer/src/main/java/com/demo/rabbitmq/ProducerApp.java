package com.demo.rabbitmq;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

public class ProducerApp {

    private static final String QUEUE_NAME = "student_queue";

    public static void main(String[] args) {

        try {

            ConnectionFactory factory = new ConnectionFactory();
            factory.setHost("192.168.1.36");
            factory.setUsername("appuser");
            factory.setPassword("123456");

            Connection connection = factory.newConnection();
            Channel channel = connection.createChannel();

            channel.queueDeclare(
                    QUEUE_NAME,
                    false,
                    false,
                    false,
                    null
            );

            
            String message = "Hello Students from Nirjala";

            channel.basicPublish(
                    "",
                    QUEUE_NAME,
                    null,
                    message.getBytes()
            );

            System.out.println(" Sent: " + message);

            channel.close();
            connection.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
