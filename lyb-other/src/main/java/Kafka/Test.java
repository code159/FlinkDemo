package Kafka;


/**
 * Created by liyubin on 2018/7/2 0002.
 */
public class Test {
    public static void main(String[] args){
//        new Thread(new KafkaConsumer(KafkaConfig.TOPICS)).start();

        new Thread(new KafkaProducer(KafkaConfig.TOPICS, 1)).start();
    }
}
