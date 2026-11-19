package cn.iyanyu.base.mq.consumer;

import cn.iyanyu.base.api.component.mq.consumer.ConsumerLifecycleManager;
import cn.iyanyu.base.mq.config.MqConsumerProperties;
import cn.iyanyu.base.mq.config.NameServerInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Map;

public class MQConsumerStartHelper {
    private static final Logger log = LoggerFactory.getLogger(MQConsumerStartHelper.class);
    private final List<ConsumerLifecycleManager> lifecycleManagerList;
    private final MqConsumerProperties mqConsumerProperties;

    public MQConsumerStartHelper(List<ConsumerLifecycleManager> lifecycleManagerList, MqConsumerProperties mqConsumerProperties) {
        this.lifecycleManagerList = lifecycleManagerList;
        this.mqConsumerProperties = mqConsumerProperties;
    }

    public void start() {
        if (!this.lifecycleManagerList.isEmpty()) {
            this.lifecycleManagerList.forEach((lifecycleManager) -> {
                Map<String, NameServerInfo> nameServerInfoMap = this.mqConsumerProperties.getServers();

                for (Map.Entry<String, NameServerInfo> entry : nameServerInfoMap.entrySet()) {
                    try {
                        String id = entry.getKey();
                        boolean enabled = entry.getValue().isEnabled();
                        if (enabled) {
                            lifecycleManager.activeConsumer(id);
                            log.info("success start consumer, server id [{}]", id);
                        }
                    } catch (Throwable var7) {
                        //
                    }
                }

            });
        } else {
            log.warn("lifecycleManager is null.");
        }

    }

    public void shutdown() {
        if (!this.lifecycleManagerList.isEmpty()) {
            this.lifecycleManagerList.forEach((lifecycleManager) -> {
                Map<String, NameServerInfo> nameServerInfoMap = this.mqConsumerProperties.getServers();
                for (Map.Entry<String, NameServerInfo> entry : nameServerInfoMap.entrySet()) {
                    try {
                        String id = entry.getKey();
                        boolean enabled = entry.getValue().isEnabled();
                        if (enabled) {
                            lifecycleManager.stopConsumer(id);
                            log.info("success shutdown consumer, server id [{}]", id);
                        }
                    } catch (Throwable var7) {
                        //
                    }
                }

            });
        } else {
            log.warn("lifecycleManager is null.");
        }

    }
}