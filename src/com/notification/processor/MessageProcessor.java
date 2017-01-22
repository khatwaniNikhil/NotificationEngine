package com.notification.processor;

import com.notification.domain.Message;
import com.notification.processor.filter.Filter;
import com.notification.processor.transformer.Transformer;

public interface MessageProcessor extends Filter, Transformer {
  void processMessage(Message message);

}
