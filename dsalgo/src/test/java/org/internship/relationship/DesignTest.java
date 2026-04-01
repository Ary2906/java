package org.internship.relationship;

public class DesignTest {
    public static void main(String[] args) {
        User user = new User("Bob");
        MessageService service = new EmailService();
        service.send(user.name);
    }
}