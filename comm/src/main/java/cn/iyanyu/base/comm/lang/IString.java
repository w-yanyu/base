package cn.iyanyu.base.comm.lang;

import cn.iyanyu.base.i18n.MessageUtil;

import java.io.Serializable;

public class IString implements Serializable {
    private static final long serialVersionUID = 1L;

    private final String key;
    private final String defaultValue;
    private Params parms;
    private Object[] paramList;

    public IString(IString str, Params parms) {
        this.key = str.getKey();
        this.defaultValue = str.getDefaultValue();
        this.parms = parms;
    }

    public IString(String key, String defaultValue) {
        this.key = key;
        this.defaultValue = defaultValue;
    }

    public IString(String key, String defaultValue, Params parms) {
        this.key = key;
        this.defaultValue = defaultValue;
        this.parms = parms;
    }

    public IString(String key, String defaultValue, Object... paramList) {
        this.key = key;
        this.defaultValue = defaultValue;
        if (paramList.length == 1 && paramList[0] instanceof Params) {
            this.parms = (Params)paramList[0];
        } else {
            this.paramList = paramList;
        }

    }

    public String getString() {
        return this.getString(false);
    }

    private String getString(boolean isLocal) {
        String ret = "";
        if (isLocal) {

        } else {

        }

        if (this.parms != null && this.parms.size() >= 1) {
            Params p = processParm(this.parms, isLocal);
            return MessageUtil.getMessage(ret, p);
        } else {
            return this.paramList != null && this.paramList.length > 0 ? MessageUtil.getMessage(ret, this.paramList) : ret;
        }
    }


    private static Params processParm(Params parms, boolean isLocal) {
        Params ret = new Params();

        for (String key : parms.keySet()) {
            Object value = parms.get(key);
            if (value instanceof IString) {
                if (isLocal) {
                    //
                } else {
                    //
                }
            } else {
                ret.put(key, value);
            }
        }

        return ret;
    }

    public String getKey() {
        return this.key;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }
}
