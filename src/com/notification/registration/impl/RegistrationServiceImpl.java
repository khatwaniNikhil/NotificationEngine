package com.notification.registration.impl;

import com.notification.consumer.Destination;
import com.notification.domain.Message;
import com.notification.domain.MessageType;
import com.notification.processor.MessageProcessor;
import com.notification.processor.impl.MessageProcessorChainImpl;
import com.notification.processor.impl.MessageProcessorImpl;
import com.notification.processor.sender.MessageSender;
import com.notification.processor.sender.MessageSenderWithDelay;
import com.notitfication.registration.FilterCriteria;
import com.notitfication.registration.RegistrationInterface;

public class RegistrationServiceImpl implements RegistrationInterface {

  MessageProcessorChainImpl chain = new MessageProcessorChainImpl();

  @Override
  public boolean register(String clientId, Destination destination, boolean processWithDelay,
      Long delayMillis, FilterCriteria criteria, MessageType format) {
    MessageSender sender = null;
    if (processWithDelay) {
      sender = new MessageSenderWithDelay() {

        @Override
        public void sendMessage(Message message) {
          // TODO Auto-generated method stub

        }

        @Override
        public void setDelay(int millis) {
          // TODO Auto-generated method stub

        }
      };
    } else {
      sender = new MessageSender() {

        @Override
        public void sendMessage(Message message) {
          // TODO Auto-generated method stub

        }
      };
    }
    MessageProcessor processor =
        new MessageProcessorImpl(clientId, criteria, destination, sender, format);
    chain.addProcessor(processor);


    // register EmailReceiver
    // register SMSReceiver
    // register AuditReceiver
    // Destination emailDestination = null;
    // MessageSender messageSender = null;
    // MessageProcessor emailProcessor =
    // new MessageProcessorImpl("EmailProcessor", criteria, emailDestination, messageSender,
    // MessageType.EMAIL_MESSAGE);
    // chain.addProcessor(emailProcessor);
    //
    // Destination smsDestination = null;
    // MessageSenderWithDelay smsMessageSenderWithDelay = null;
    // MessageProcessor smsProcessor =
    // new MessageProcessorImpl("SMSProcessor", criteria, smsDestination,
    // smsMessageSenderWithDelay, MessageType.SMS_MESSAGE);
    // chain.addProcessor(smsProcessor);
    //
    // Destination auditDestination = null;
    // MessageSenderWithDelay auditMessageSenderWithDelay = null;
    // MessageProcessor auditProcessor =
    // new MessageProcessorImpl("AuditProcessor", criteria, auditDestination,
    // auditMessageSenderWithDelay, MessageType.AUDIT_MESSAGE);
    // chain.addProcessor(smsProcessor);
    return true;

  }
}
