package lessons21;

public enum ErrorCodes {
    FIRST_ERROR(1),
    SECOND_ERROR(2),
    THIRD_ERROR(3);
    private int code;


     ErrorCodes(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
