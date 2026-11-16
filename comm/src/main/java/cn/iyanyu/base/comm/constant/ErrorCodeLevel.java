package cn.iyanyu.base.comm.constant;

public enum ErrorCodeLevel {
    TECHNICAL("T", "技术异常"),
    BUSINESS("B", "业务异常"),;
    private final String code;
    private final String description;

    private ErrorCodeLevel(String code, String description) {
        this.code = code;
        this.description = description;
    }

    public String getCode() {
        return this.code;
    }

    public String getDescription() {
        return this.description;
    }
}
