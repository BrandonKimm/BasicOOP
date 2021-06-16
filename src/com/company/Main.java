package com.company;

public class Main{
    /* final static은 초기화필수 이유와 static은 자동적으로 초기화 되는 이유
    *  static 키워드가 언제 메모리에 올라가고 어느 영역에 할당되는지 그 정도는 이제 잘 알아야지~ */
    final static  int a = 10;
    public static void main(String args[]){
        System.out.println(Main.a);

        ExtendsTestSuperClass realExtendsTestSuperClass = new ExtendsTestSuperClass();
        realExtendsTestSuperClass.method();

        /* 상위클래스의 타입으로 하위클래스를 생성하는건 OK 납득가능~
        *  하지만 상위클래스타입으로 하위클래스를 생성하면 묵시적으로 형변환이 일어난다
        *  사용하려면 명시적으로 형변환을 따로해줘야된다 그러니까 다형성은 인터페이스를 쓰나보다
        * <인터페이스의 존재이유> 추클과 인터페이스의 차이네 어쩌네 하는게 결국 이런 맥락이지 않나 싶네
        */

        /* 묵시적 형변환 발생 */
        ExtendsTestSuperClass extendsTestSuperClass = new ExtendsTestSubClass();
        extendsTestSuperClass.method();
        /* 명시적 형변환 상속관계일때만 가능하지~ */
        ExtendsTestSubClass castingTest = (ExtendsTestSubClass) extendsTestSuperClass;
        castingTest.subClassMethod();

        /* 그리고 하위클래스들 생성될때마다 힙에 상위클래스들도 계속 생성되는거 콘솔에 보이지~? */
        ExtendsTestSubClass testSubclass = new ExtendsTestSubClass();
        testSubclass.subClassMethod();

        System.out.println("================");
        new ExtendsTestSubSubClass();
        System.out.println("================");

        /*묵시적형변환*/
        ExtendsTestSuperClass testA = new ExtendsTestSubClass();
        testA.exec();
        ExtendsTestSubClass testB = new ExtendsTestSubClass();
        testB.subClassMethod();

        Object obj = new Object();
        /*묵시적으로 형 변환되었더라도 instanceof 통한 메소드의 피연산자는 생성된 하위타입이 된다.*/
        /* 객체 instanceof 분류  : instance instanceof class*/
        System.out.println(testA instanceof ExtendsTestSubSubClass);
    }
}