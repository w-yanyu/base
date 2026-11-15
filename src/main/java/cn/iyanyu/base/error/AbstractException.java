package cn.iyanyu.base.error;

public class AbstractException extends RuntimeException{
    public AbstractException() {
    }

    public AbstractException(String msg) {
        super(msg);
    }

    public AbstractException(Throwable cause) {
        super(cause);
    }
}
