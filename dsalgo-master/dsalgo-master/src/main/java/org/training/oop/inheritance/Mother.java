package org.training.oop.inheritance;

public class Mother {
    String name;

    Mother(String name){
        this.name = name;
    }

    public void sayMyName() {
        System.out.println(this.name);
    }

    public static void main(String[] args) {
        Son son = new Son("abc");
        son.sayMyName();
        Mother mother = son;
        mother.sayMyName();
    }
}

class Son extends Mother {

    Son(String name) {
        super(name);
    }

    @Override
    public void sayMyName() {
        super.sayMyName();
    }
}
