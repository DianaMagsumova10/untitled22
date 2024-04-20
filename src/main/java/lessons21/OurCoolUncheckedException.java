package lessons21;

public class OurCoolUncheckedException extends RuntimeException{
    private Integer errorCode;

    public OurCoolUncheckedException(String message, Throwable cause) {
        super(message, cause);
    }

    public OurCoolUncheckedException(Throwable cause) {
        super(cause);
    }

    public OurCoolUncheckedException(String message) {
        super(message);
    }
    public OurCoolUncheckedException(String message, Throwable cause, ErrorCodes errorCode) {
        super(message, cause);
        this.errorCode = errorCode.getCode();
    }
    public Integer getErrorCode() {
        return errorCode;
    }

}
