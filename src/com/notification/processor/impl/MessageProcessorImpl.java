package com.notification.processor.impl;

import com.notification.consumer.Destination;
import com.notification.domain.Message;
import com.notification.domain.MessageType;
import com.notification.processor.MessageProcessor;
import com.notification.processor.sender.MessageSender;
import com.notitfication.registration.FilterCriteria;

public class MessageProcessorImpl implements MessageProcessor {

  String id;

  FilterCriteria filterCriteria;

  Destination destination;

  MessageSender sender;

  MessageType subscriberFormat;

  public MessageProcessorImpl(String id, FilterCriteria filterCriteria, Destination destination,
      MessageSender sender, MessageType subscriberFormat) {
    // TODO Auto-generated constructor stub
  }

  @Override
  public void setFilterCriteria(FilterCriteria filterCriteria) {
    this.filterCriteria = filterCriteria;
  }

  @Override
  public boolean applyFilterCriteria() {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public Message transform(Message message) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public void processMessage(Message srcMessage) {
    boolean isFilteredIn = applyFilterCriteria();
    if (isFilteredIn) {
      Message destMsg = transform(srcMessage);
      sender.sendMessage(destMsg);
    }
  }

}
