package org.internship.AccessModifier;

public class GlobalDataTest {
    public static void main(String[] args) {
        GlobalData data = new GlobalData();
        System.out.println("Open URL: " + data.website); // Works everywhere
    }
}