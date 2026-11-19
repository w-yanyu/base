package cn.iyanyu.base.api;

import org.springframework.core.Ordered;

public interface AppLifecycle extends Ordered {
    void start();

    void stop();

    int getOrder();
}