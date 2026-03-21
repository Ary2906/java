package org.training.oop.abstraction;

public interface MessagingService {
    String sendMessage(String msg);
}

class EmailService implements MessagingService {
    @Override
    public String sendMessage(String msg) {
        return "Email sent: " + msg;
    }
}

class SMSService implements MessagingService {
    @Override
    public String sendMessage(String msg) {
        return "SMS sent: " + msg;
    }
}

