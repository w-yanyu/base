package cn.iyanyu.base.comm.error;


import cn.iyanyu.base.constant.ErrorCodeLevel;

public class BusinessException extends AbstractException{

    public static final ErrorCodeLevel LEVEL = ErrorCodeLevel.BUSINESS;
    private String code = "";
    private ErrorCode errorCode;

    public BusinessException(String code, String message) {
        super(message);
        this.code = code;
    }
}
