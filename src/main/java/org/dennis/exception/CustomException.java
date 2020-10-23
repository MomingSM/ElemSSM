package org.dennis.exception;

/**
 * @创建人 dennis[ccc]
 * @创建时间 2020/10/18 0018
 * @描述
 */
public class CustomException extends Exception {
    public String message;

    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
