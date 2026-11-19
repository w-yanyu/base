package cn.iyanyu.base.mq.config;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(
    prefix = "app.mq.consumer"
)
@Validated
public class MqConsumerProperties {
    private List<String> activeGroup = new ArrayList<>();
    private Map<String, NameServerInfo> servers = new HashMap<>();
    private Map<String, String> topic = new LinkedHashMap<>();
    private Map<String, String> zoneTopic = new LinkedHashMap<>();
    private Map<String, String> broadcastTopic = new LinkedHashMap<>();
    private ConsumerPool consumerPool;
    private String mqType;
    private String consumeType = "push";
    private boolean messageRepeat = false;
    private boolean multEnvFlag = true;

    public MqConsumerProperties() {
    }

    public boolean isMultEnvFlag() {
        return this.multEnvFlag;
    }

    public void setMultEnvFlag(boolean multEnvFlag) {
        this.multEnvFlag = multEnvFlag;
    }

    public boolean isMessageRepeat() {
        return this.messageRepeat;
    }

    public void setMessageRepeat(boolean messageRepeat) {
        this.messageRepeat = messageRepeat;
    }

    public String getConsumeType() {
        return this.consumeType;
    }

    public void setConsumeType(String consumeType) {
        this.consumeType = consumeType;
    }

    public String getMqType() {
        return this.mqType;
    }

    public void setMqType(String mqType) {
        this.mqType = mqType;
    }

    public List<String> getActiveGroup() {
        return this.activeGroup;
    }

    public void setActiveGroup(List<String> activeGroup) {
        this.activeGroup = activeGroup;
    }

    public Map<String, NameServerInfo> getServers() {
        return this.servers;
    }

    public void setServers(Map<String, NameServerInfo> servers) {
        this.servers = servers;
    }

    public ConsumerPool getConsumerPool() {
        return this.consumerPool;
    }

    public void setConsumerPool(ConsumerPool consumerPool) {
        this.consumerPool = consumerPool;
    }

    public Map<String, String> getTopic() {
        return this.topic;
    }

    public void setTopic(Map<String, String> topic) {
        this.topic = topic;
    }

    public Map<String, String> getZoneTopic() {
        return this.zoneTopic;
    }

    public void setZoneTopic(Map<String, String> zoneTopic) {
        this.zoneTopic = zoneTopic;
    }

    public Map<String, String> getBroadcastTopic() {
        return this.broadcastTopic;
    }

    public void setBroadcastTopic(Map<String, String> broadcastTopic) {
        this.broadcastTopic = broadcastTopic;
    }

    public static class ConsumerPool {
        private int minThread = 25;
        private int maxThread = 50;
        private long keepAliveTime = 60L;
        private int queueSize = 100;
        private String threadNamePrefix = "MessageReConsume_";

        public ConsumerPool() {
        }

        public int getMinThread() {
            return this.minThread;
        }

        public void setMinThread(int minThread) {
            this.minThread = minThread;
        }

        public int getMaxThread() {
            return this.maxThread;
        }

        public void setMaxThread(int maxThread) {
            this.maxThread = maxThread;
        }

        public long getKeepAliveTime() {
            return this.keepAliveTime;
        }

        public void setKeepAliveTime(long keepAliveTime) {
            this.keepAliveTime = keepAliveTime;
        }

        public int getQueueSize() {
            return this.queueSize;
        }

        public void setQueueSize(int queueSize) {
            this.queueSize = queueSize;
        }

        public String getThreadNamePrefix() {
            return this.threadNamePrefix;
        }

        public void setThreadNamePrefix(String threadNamePrefix) {
            this.threadNamePrefix = threadNamePrefix;
        }
    }
}
