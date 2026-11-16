package cn.iyanyu.base.comm.error;

import cn.iyanyu.base.constant.ErrorCodeLevel;

public class SystemException extends AbstractException {

    public static final ErrorCodeLevel LEVEL = ErrorCodeLevel.TECHNICAL;
    private String code = "";
    private ErrorCode errorCode;

    public SystemException(String code, String message) {
        super(message);
        this.code = code;
    }


    public SystemException(String code, String message, String... params) {
        super(message, params);
        this.code = code;
    }

    public SystemException(String code, String message, Throwable cause) {
        super(message, cause);
        this.code = code;
    }
}
