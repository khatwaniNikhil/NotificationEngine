package com.notification.processor.sender;

import com.notification.domain.Message;

public interface MessageSender {

  void sendMessage(Message message);
}
