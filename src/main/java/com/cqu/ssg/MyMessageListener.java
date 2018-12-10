package com.cqu.ssg;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

/**
 * Created by yang.song on 2018/12/10 21:46
 * <p>
 * e-mail:binaryys@gmail.com
 *
 * reference:https://www.cnblogs.com/likemebee/p/activeMQ.html
 */
public class MyMessageListener implements MessageListener {
    public void onMessage(Message message) {
        TextMessage textMessage = (TextMessage)message;
        try {
            System.out.println("receive message=" + textMessage.getText());
        }catch (Exception e){
           e.printStackTrace();
        }
    }
}
