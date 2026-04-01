package org.internship.relationship;

class User {
    String name;
    User(String name) { this.name = name; }
}

interface MessageService {
    void send(String msg);
}

class EmailService implements MessageService {
    public void send(String msg) {
        System.out.println("Email sent to " + msg);
    }
}