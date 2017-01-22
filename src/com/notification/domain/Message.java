package com.notification.domain;

import java.util.Map;

public class Message {
  Map<String, String> header;
  Map<String, String> payload;

  MessageType messageType;
}
