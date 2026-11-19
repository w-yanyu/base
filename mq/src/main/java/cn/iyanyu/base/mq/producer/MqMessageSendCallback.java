package cn.iyanyu.base.mq.producer;

import cn.iyanyu.base.model.api.mq.common.MqMessage;
import cn.iyanyu.base.mq.common.MqSendResult;

public interface MqMessageSendCallback {
    void successCallback(MqMessage mqMessage, MqSendResult MqSendResult);

    void exceptionCallback(MqMessage mqMessage, Throwable e);
}
