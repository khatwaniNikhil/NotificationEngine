package com.notification.consumer;

import com.notification.domain.Message;



public interface Consumer {

  boolean subscribe(Destination rawMsgDestination);

  void handleMessage(Message message);

}
