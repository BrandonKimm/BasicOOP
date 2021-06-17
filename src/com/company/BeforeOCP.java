package com.company;

public class BeforeOCP {
}
class MainBeforeOCP{
    public void /*static*/ main(){
        BeforeDogOCP dog = new BeforeDogOCP();
        dog.goParkWalk();
        dog.goBeachWalk();
        /**
         * 공원산책 해변산책까지는 뭐 그렇다지만..
         * 만약 여기서 강변산책이 생긴다면~? Dog클래스에 메소드를 추가해줘야 된다.
         *
         * OCP원칙 위배
         * 확장에 대해 열려있지 않은상태이다.
         * */
    }
}
class BeforeDogOCP{
    /**
     * 공원으로 산책가는 메소드
     * */
    public void goParkWalk(){
        System.out.println("강아지가 공원으로 산책을 가는 행위");
    }
    /**
     * 해변으로 산책가는 메소드
     * */
    public void goBeachWalk(){
        System.out.println("강아지가 해변으로 산책을 가는 행위");
    }
}
