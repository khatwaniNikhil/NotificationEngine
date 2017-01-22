package com.notitfication.registration;

import com.notification.consumer.Destination;
import com.notification.domain.MessageType;

public interface RegistrationInterface {
  boolean register(String clientId, Destination destination, boolean processWithDelay,
      Long delayMillis, FilterCriteria criteria, MessageType format);
}
