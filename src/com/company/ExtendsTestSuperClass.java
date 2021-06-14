package com.company;

public class ExtendsTestSuperClass {

    public ExtendsTestSuperClass(){
        System.out.println("Test Constructor");
    }
    public ExtendsTestSuperClass(int a) {
        this.exec();
    }
    public void method(){
        System.out.println("Test 의 메소드!");
    }

    private void exec() {
        System.out.println("Test.exec()");
    }
}
