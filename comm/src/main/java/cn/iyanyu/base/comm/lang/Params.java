package cn.iyanyu.base.comm.lang;

import java.util.HashMap;
import java.util.Map;

public class Params extends HashMap<String, Object> {
    public Params() {
    }

    public Params add(String key, Object value) {
        this.put(key, value);
        return this;
    }

    public Params addAll(Map<String, Object> map) {
        this.putAll(map);
        return this;
    }

    public Params addAll(Params map) {
        this.putAll(map);
        return this;
    }
}
