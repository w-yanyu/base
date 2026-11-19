package cn.iyanyu.base.mq.producer.enums;

public enum SendStatus {
    SEND_OK,
    FLUSH_DISK_TIMEOUT,
    FLUSH_SLAVE_TIMEOUT,
    SLAVE_NOT_AVAILABLE,
    SEND_FAIL;

    private SendStatus() {
    }
}