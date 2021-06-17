package com.company;

public class BeforeSRP {
}
class BeforeDogSRP {
    /**
     * 강아지클래스
     * */
    final static boolean male = true;
    //final static boolean female = false;
    boolean gender;

    /**
     * 강아지클래스를 이용해 인스턴스를 생성할때부터 성별을 인자값으로 던져주도록 강제해야되고
     * 소변을보는 pee() 행위를 할때마다 성별에 따른 소변행위를 분기처리 해줘야된다.
     * 강아지클래스의 pee() 메소드가 수컷강아지와 암컷강아지의 행위를 둘 다 책임지려고한다.
     * */
    public BeforeDogSRP(boolean gender) {
        this.gender = gender;
    }
    /**
     * SRP 위배!
     * 이유는 암컷의 소변보는 자세가 변경되어도 강아지클래스는 수정되어야하고,
     *      수컷의 소변보는 자세가 변경되어도 강아지클래스는 수정되어야한다.
     * ==> 어떤 클래스를 변경해야 하는 이유는 오직 하나뿐이어야 한다.
     * */
    void pee() {
        if (this.gender == male) {
            System.out.println("수컷강아지가 소변을보는 행위");
        } else {
            System.out.println("암컷강아지가 소변을보는 행위");
        }
    }
}
