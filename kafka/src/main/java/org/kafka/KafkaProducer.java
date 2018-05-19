package org.kafka;

import java.util.Properties;

import kafka.javaapi.producer.Producer;
import kafka.producer.KeyedMessage;
import kafka.producer.ProducerConfig;

/**
 * Create by fengtang
 * 2015/10/8 0008
 * KafkaDemo_01
 */
public class KafkaProducer {
    private final Producer<String, String> producer;
    public final static String TOPIC = "TEST-TOPIC";
    private KafkaProducer() {
        Properties props = new Properties();
        /**
         * 此处配置的是kafka的端口"192.168.1.116:9092"
         */
        props.put("metadata.broker.list", "127.0.0.1:9092");

        /**
         *  配置value的序列化类
         */
        props.put("serializer.class", "kafka.serializer.StringEncoder");
        /**
         * 配置key的序列化类
         */
        props.put("key.serializer.class", "kafka.serializer.StringEncoder");

        props.put("request.required.acks", "-1");
        producer = new Producer<>(new ProducerConfig(props));
    }

    void produce() {
        int messageNo = 1000;
        final int COUNT = 10000;
        while (messageNo < COUNT) {
            String key = String.valueOf(messageNo);
            String data = "hello kafka message " + key;
            producer.send(new KeyedMessage<>(TOPIC, key, data));
            System.out.println(data);
            messageNo++;
        }
    }

    public static void main(String[] args) {
        new KafkaProducer().produce();
    }
}