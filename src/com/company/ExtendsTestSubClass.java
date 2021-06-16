package com.company;

public class ExtendsTestSubClass extends ExtendsTestSuperClass {
    public ExtendsTestSubClass() {
        System.out.println("TestSubClassConstructor");
    }
    public void subClassMethod(){
        System.out.println("subClassMethod");
    }

    /* 스태틱메소드는 컴파일시점에 이미 클래스영역에 할당되니까
    *
    * 인스턴스가 생성되는 시점에 의미가 있는 오버라이드는 컴파일부터 에러나고
    * 굳이 상속되는 것 처럼 보이는역할하는게 둘 다 스태틱으로 선언하고 같은 메소드이름쓰는 하이딩
    * 물론 비추천하는 내용이다. 스태틱메소드는 오버라이딩 안하는게 맞다! */
    public static void exec(){
        System.out.println("Subclass");
    }
}
