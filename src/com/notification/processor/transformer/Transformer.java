package com.notification.processor.transformer;

import com.notification.domain.Message;

public interface Transformer {
  Message transform(Message message);
}
