package com.fortegroup.security.model;

/**
 * Simple Response pojo object for return result for our operation @see{@link com.fortegroup.security.utill.MessageFactory}
 * @author Alexey Burov
 * @version 1.0
 */
public class Message {
    private boolean isError;
    private String message;

    public Message() {
    }

    public Message(boolean isError, String message) {
        this.isError = isError;
        this.message = message;
    }


    public boolean isError() {
        return isError;
    }

    public void setError(boolean error) {
        isError = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
