package com.mdiaf.notify.listener;

import com.mdiaf.notify.message.IMessage;

/**
 * Created by Eason on 15/10/5.
 */
public class NotifyListener extends AbstractRabbitMessageListener {

    @Override
    public void handle(IMessage message) throws Exception {
        System.out.println("ok i am here.NotifyListener");
        TestMessage testMessage = (TestMessage) message.getBody();
        System.out.println(System.currentTimeMillis() - testMessage.getTime().getTime());
        System.out.println(testMessage);
    }

}
