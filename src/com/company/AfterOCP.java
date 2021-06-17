package com.company;

public class AfterOCP {
}
class MainAfterOCP{
    public void /*static*/ main(){
        AfterDogOCP dog = new AfterDogOCP();

        IPlace beach = new BeachPlace();
        IPlace park  = new ParkPlace();
        IPlace river = new RiverPlace();


        dog.goWalk(beach);
        dog.goWalk(park);
        dog.goWalk(river);

    }
}
/* OCP를 위한 인터페이스 */
interface IPlace{
    String getPlaceName();
}
/* 산책하는 장소가 추가될 때 마다 클래스만 추가하면 된다. */
class BeachPlace implements  IPlace{
    final static String placeName = "해변";

    @Override
    public String getPlaceName(){
        return placeName;
    }
}
class ParkPlace implements  IPlace{
    final static String placeName ="공원";

    @Override
    public String getPlaceName() {
        return placeName;
    }
}
class RiverPlace implements  IPlace{
    final static String placeName = "강변";

    @Override
    public String getPlaceName() {
        return placeName;
    }
}
class AfterDogOCP{
    /**
     * 산책간다는 메소드
     * */
    public void goWalk(IPlace place){
        System.out.println("강아지가"+place.getPlaceName()+" 으로 산책을 가는 행위");
    }
}
