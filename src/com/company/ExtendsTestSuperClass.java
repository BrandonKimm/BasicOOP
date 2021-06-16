package com.company;

public class ExtendsTestSuperClass {
    int a = 0;
    static int b =3;
    private int c= 3;
    final static int d=3;

    public ExtendsTestSuperClass(){
        System.out.println("Test Constructor");
    }
    public ExtendsTestSuperClass(int a) {
        this.exec();
    }
    public void method(){
        System.out.println("Test 의 메소드!");
    }

    public static void exec() {
        System.out.println("Test.exec()");
        System.out.println(d);
    }

    public void test(){
        a =3;
        c=2;
        b=3;

    }
}
