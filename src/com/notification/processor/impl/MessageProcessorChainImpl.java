package com.notification.processor.impl;

import java.util.Set;

import com.notification.domain.Message;
import com.notification.processor.MessageProcessor;
import com.notification.processor.MessageProcessorChain;

public class MessageProcessorChainImpl implements MessageProcessorChain {

  private Set<MessageProcessor> processors;

  @Override
  public void setProcessors(Set<MessageProcessor> processors) {
    this.processors = processors;

  }

  @Override
  public void process(Message message) {
    for (MessageProcessor processor : processors) {
      processor.processMessage(message);
    }
  }

  @Override
  public void addProcessor(MessageProcessor processor) {
    processors.add(processor);
  }
}
