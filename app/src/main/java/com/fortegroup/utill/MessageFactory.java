package com.fortegroup.utill;

import com.fortegroup.model.accounts.Message;

/**
 * Created by alex on 16.4.17.
 */
public final class MessageFactory {

    private MessageFactory() {
    }

    public static Message getMessage(String pMessage,boolean pIsError){
        return new Message(pIsError,pMessage);
    }
}