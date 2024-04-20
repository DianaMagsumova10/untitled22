package lessons21;

import java.util.Arrays;

public class Check {
    public static void main(String[] args) {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        System.out.println(Arrays.toString(stackTrace));

        OurCoolUncheckedException exception = getException(3);
        System.out.println("getException().getErrorCode() = " + exception.getErrorCode());
        throw exception;
    }

//    public static void getException() {
//        throw new OurCoolUncheckedException("Наше крутое исключение!");
//    }

    public static OurCoolUncheckedException getException(int errorCode) {
        return switch (errorCode) {
            case 1:
                yield new OurCoolUncheckedException("Наше крутое исключение! Мы получили ошибку: " + ErrorCodes.FIRST_ERROR.getCode(), new Throwable(), ErrorCodes.FIRST_ERROR);
            case 2:
                yield new OurCoolUncheckedException("Наше крутое исключение! Мы получили ошибку: " + ErrorCodes.SECOND_ERROR.getCode(), new Throwable(), ErrorCodes.SECOND_ERROR);
            default: // здесь мы подхватим тройку и все остальные коды, которые мы еще не добавили, то есть, это действие по умолчанию. Подробнее можешь узнать здесь Switch case Java (оператор switch в Java) (javarush.ru)
                yield new OurCoolUncheckedException("Наше крутое исключение! Мы получили ошибку: " + ErrorCodes.THIRD_ERROR.getCode(), new Throwable(), ErrorCodes.THIRD_ERROR);
        };
    }
}

