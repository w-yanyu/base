package cn.iyanyu.base.model.api.online;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.io.Serial;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class OnlineResponse implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private Map<String, Object> output = new HashMap<>();
    private Map<String, Object> sys = new HashMap<>();
    private Map<String, Object> commResp = new HashMap<>();
    private Map<String, Object> printer = new HashMap<>();

    public OnlineResponse() {
    }

    public Map<String, Object> getPrinter() {
        return this.printer;
    }

    public void setPrinter(Map<String, Object> printer) {
        this.printer = printer;
    }

    public Map<String, Object> getOutput() {
        return this.output;
    }

    public void setOutput(Map<String, Object> output) {
        this.output = output;
    }

    public Map<String, Object> getSys() {
        return this.sys;
    }

    public void setSys(Map<String, Object> sys) {
        this.sys = sys;
    }

    public Map<String, Object> getCommResp() {
        return this.commResp;
    }

    public void setCommResp(Map<String, Object> commResp) {
        this.commResp = commResp;
    }

    public Object getFromSys(String key) {
        return this.getSys().get(key);
    }

    public Object getFromCommResp(String key) {
        return this.getCommResp().get(key);
    }

    public Object getFromOutput(String key) {
        return this.getOutput().get(key);
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

    public void putIntoCommResp(String key, Object value) {
        if (StringUtils.hasLength(key)) {
            this.getCommResp().put(key, value);
        }

    }

    public void putIntoCommResp(Map<String, Object> map) {
        if (!CollectionUtils.isEmpty(map)) {
            this.getCommResp().putAll(map);
        }

    }

    public void putIntoOutput(String key, Object value) {
        if (StringUtils.hasLength(key)) {
            this.getOutput().put(key, value);
        }

    }

    public void putIntoOutput(Map<String, Object> map) {
        if (!CollectionUtils.isEmpty(map)) {
            this.getOutput().putAll(map);
        }

    }

    public String toString() {
        StringBuffer sb = new StringBuffer("OnlineResponse{");
        sb.append("output=").append(this.output.toString());
        sb.append(", sys=").append(this.sys.toString());
        sb.append(", commResp=").append(this.commResp.toString());
        sb.append(", printer=").append(this.printer.toString());
        sb.append('}');
        return sb.toString();
    }
}