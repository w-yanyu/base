package cn.iyanyu.base.mq.producer;

public interface MessageProducerDecorator {
    MessageProducer decorate(MessageProducer messageProducer);
}