//package org.kafka;
//
//import java.util.concurrent.CountDownLatch;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.kafka.annotation.KafkaListener;
//
//public class SimpleConsumerListener {
//    private final static Logger logger = LoggerFactory.getLogger(SimpleConsumerListener.class);
//    private final CountDownLatch latch1 = new CountDownLatch(1);
//
//    @KafkaListener(id = "foo", topics = "topic-test")
//    public void listen(byte[] records) {
//        //do something here
//        this.latch1.countDown();
//    }
//}