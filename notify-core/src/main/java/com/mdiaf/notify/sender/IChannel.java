package com.mdiaf.notify.sender;

/**
 * Created by Eason on 15/11/18.
 */
public interface IChannel extends IMessageSender{

    boolean isOpen();

    void free();
}
