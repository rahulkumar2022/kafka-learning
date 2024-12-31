package com.learn.Kafka.consumer;

import com.learn.Kafka.payload.Student;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class KafkaConsumer {

    //@KafkaListener(topics = "Learner",groupId = "myGroup")
//    public void consumeMessage(String message){
//        log.info(String.format("Consuming from Learner topic:: %s",message));
//
//    }

    @KafkaListener(topics = "Learner",groupId = "myGroup")
    public void consumeMessage(Student student){
        log.info(String.format("Consuming from Learner topic:: %s",student.toString()));

    }


}
