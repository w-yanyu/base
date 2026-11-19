package cn.iyanyu.base.mq.common;

import cn.iyanyu.invoke.api.mq.enums.LocalTransactionState;

public class MqTransactionSendResult extends MqSendResult {
    private LocalTransactionState localTransactionState;

    public MqTransactionSendResult() {
    }

    public LocalTransactionState getLocalTransactionState() {
        return this.localTransactionState;
    }

    public void setLocalTransactionState(LocalTransactionState localTransactionState) {
        this.localTransactionState = localTransactionState;
    }
}
