package com.notification.processor;

import java.util.Set;

import com.notification.domain.Message;

public interface MessageProcessorChain {

  void addProcessor(MessageProcessor processor);

  void setProcessors(Set<MessageProcessor> processors);

  void process(Message message);

}
