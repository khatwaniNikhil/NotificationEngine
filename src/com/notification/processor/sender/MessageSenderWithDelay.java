package com.notification.processor.sender;



public interface MessageSenderWithDelay extends MessageSender {
  void setDelay(int millis);
}
