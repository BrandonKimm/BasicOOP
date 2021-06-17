package com.company;

public class ExtendsTestSubClass extends ExtendsTestSuperClass {

    /**
     * 두번다시 잊지말자
     * class변수 / instance 변수
     * 생각해봐 클래스에 static으로 붙으면 클래스가 로드될떄 같이 초기화되거나 지정한 값으로 사용되겠지 지
     * 그리고 앞으로 생성되는 모든 데이터에서 전역으로 관리되겠지! 스태틱이니까 클래스변수인거고
     *
     * instance 변수는 물론 선언만 해두겠지만 객체가 각각 생성 될때마다 별도로 다 하나씩 객체마다 가지고있는 변수야
     * 이제 그만 좀 헷갈려라 이 바보야 */
    static int classVar = 10 ;
    int instanceVar =10;

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
