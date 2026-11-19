package cn.iyanyu.base.model.api.online;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class OnlineRequest implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Map<String, Object> input = new HashMap<>();
    private Map<String, Object> sys = new HashMap<>();
    private Map<String, Object> commReq = new HashMap<>();

    public OnlineRequest() {
    }

    public Map<String, Object> getInput() {
        return this.input;
    }

    public void setInput(Map<String, Object> input) {
        this.input = input;
    }

    public Map<String, Object> getSys() {
        return this.sys;
    }

    public void setSys(Map<String, Object> sys) {
        this.sys = sys;
    }

    public Map<String, Object> getCommReq() {
        return this.commReq;
    }

    public void setCommReq(Map<String, Object> commReq) {
        this.commReq = commReq;
    }

    public void setComm_req(Map<String, Object> commReq) {
        this.commReq = commReq;
    }

    public Object getFromSys(String key) {
        return this.getSys().get(key);
    }

    public Object getFromCommReq(String key) {
        return this.getCommReq().get(key);
    }

    public Object getFromInput(String key) {
        return this.getInput().get(key);
    }

    public void putIntoSys(String key, Object value) {
        if (StringUtils.hasLength(key)) {
            this.getSys().put(key, value);
        }

    }

    public void putIntoSys(Map<String, Object> map) {
        if (!CollectionUtils.isEmpty(map)) {
            this.getSys().putAll(map);
        }

    }

    public void putIntoCommReq(String key, Object value) {
        if (StringUtils.hasLength(key)) {
            this.getCommReq().put(key, value);
        }

    }

    public void putIntoCommReq(Map<String, Object> map) {
        if (!CollectionUtils.isEmpty(map)) {
            this.getCommReq().putAll(map);
        }

    }

    public void putIntoInput(String key, Object value) {
        if (StringUtils.hasLength(key)) {
            this.getInput().put(key, value);
        }

    }

    public void putIntoInput(Map<String, Object> map) {
        if (!CollectionUtils.isEmpty(map)) {
            this.getInput().putAll(map);
        }

    }
}