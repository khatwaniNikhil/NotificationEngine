package com.notification.consumer.impl;



import com.notification.consumer.Consumer;
import com.notification.consumer.Destination;
import com.notification.domain.Message;
import com.notification.processor.MessageProcessorChain;

public class RawMessageConsumer implements Consumer {

  private MessageProcessorChain processorChain;


  @Override
  public boolean subscribe(Destination rawMsgDestination) {
    // TODO Auto-generated method stub
    return true;
  }

  @Override
  public void handleMessage(Message message) {
    processorChain.doProcessing();
  }

}
