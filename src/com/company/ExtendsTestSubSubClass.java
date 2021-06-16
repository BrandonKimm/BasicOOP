package com.company;

public class ExtendsTestSubSubClass extends ExtendsTestSubClass {
    public ExtendsTestSubSubClass() {
        System.out.println("ExtendsTestSubSubClass");
    }
    public void subSubClassMethod(){
        System.out.println("subSubClassMethod");
    }

    public static void exec(){
        System.out.println("SubSubClass.exec()");
    }

}
