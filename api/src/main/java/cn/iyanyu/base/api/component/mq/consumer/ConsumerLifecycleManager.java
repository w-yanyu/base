package cn.iyanyu.base.api.component.mq.consumer;

import java.util.List;

public interface ConsumerLifecycleManager {
    void activeConsumer(String id) throws Throwable;

    void stopConsumer(String id) throws Throwable;

    void pauseConsumer(String id) throws Throwable;

    default void pauseConsumer() throws Throwable {
        for (String consumerId : this.getAllConsumers()) {
            this.pauseConsumer(consumerId);
        }
    }

    void resumeConsumer(String id) throws Throwable;

    default void resumeConsumer() throws Throwable {
        for (String consumerId : this.getAllConsumers()) {
            this.resumeConsumer(consumerId);
        }
    }

    List<String> currentActives();

    List<String> getAllConsumers();
}
