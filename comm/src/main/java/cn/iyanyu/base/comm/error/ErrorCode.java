package cn.iyanyu.base.comm.error;

public class ErrorCode {
    private final String key;
    private final String id;
    private final String errorCode;

    public ErrorCode(String key, String id, String errorCode) {
        this.key = key;
        this.id = id;
        this.errorCode = errorCode;
    }

    public String getKey() {
        return key;
    }

    public String getId() {
        return id;
    }

    public String getErrorCode() {
        return errorCode;
    }
}
