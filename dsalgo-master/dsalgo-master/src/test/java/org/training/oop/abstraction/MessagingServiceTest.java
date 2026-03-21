package org.training.oop.abstraction;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MessagingServiceTest {
    @Test
    void testEmailServiceImplementation() {
        MessagingService service = new EmailService();
        assertEquals("Email sent: Hello", service.sendMessage("Hello"));
    }

    @Test
    void testSMSServiceImplementation() {
        MessagingService service = new SMSService();
        assertEquals("SMS sent: Hi", service.sendMessage("Hi"));
    }
}
