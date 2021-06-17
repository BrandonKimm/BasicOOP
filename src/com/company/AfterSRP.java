package com.company;

public class AfterSRP {
}
abstract  class AfterDogSRP {
    abstract void pee();
}
class maleDog extends AfterDogSRP {
    @Override
    void pee() {
        System.out.println("수컷강아지가 소변을 보는 행위");
    }
}class femaleDog extends AfterDogSRP {
    @Override
    void pee() {
        System.out.println("암컷강아지가 소변을 보는 행위");
    }
}
