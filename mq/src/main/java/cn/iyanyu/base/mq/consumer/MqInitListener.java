package cn.iyanyu.base.mq.consumer;

import cn.iyanyu.base.api.AppLifecycle;
import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class MqInitListener implements AppLifecycle, ApplicationContextAware {
    private final MQConsumerStartHelper mqConsumerStartHelper;
    private ApplicationContext applicationContext;

    public MqInitListener(MQConsumerStartHelper mqConsumerStartHelper) {
        this.mqConsumerStartHelper = mqConsumerStartHelper;
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public void start() {
        if (this.applicationContext.containsBean("rocketMQConsumerStartHelper")) {
            this.mqConsumerStartHelper.start();
        }

    }

    public void stop() {
        if (this.applicationContext.containsBean("rocketMQConsumerStartHelper")) {
            this.mqConsumerStartHelper.shutdown();
        }

    }

    public int getOrder() {
        return 500;
    }
}