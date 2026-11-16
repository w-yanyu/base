package cn.iyanyu.base.comm.error;

public class AbstractException extends RuntimeException{

    private String[] params;
    private String massage;

    public AbstractException() {
    }

    public AbstractException(String msg) {
        super(msg);
    }

    public AbstractException(Throwable cause) {
        super(cause);
    }

    public AbstractException(String msg, Throwable cause) {
        super(msg, cause);
    }

    public AbstractException(String message, String[] params) {
        super(message);
        this.massage = message;
        this.params = params;
    }
}
