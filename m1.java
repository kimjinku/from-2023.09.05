// 문제 : 자동차가 3번 달리게 해주세요.
// 출력 : 자동차가 달립니다.

public class m1 {
    public static void main(String[] args) {
        //v1. 1개의 자동차가 3번 달리게 해주세요.
        Car car = new Car();
        for(int i=1;i<=3;i++){
            car.run();}

        //v2. 3개의 자동차가 1번씩 달리게 해주세요.
        Car car1 = new Car();
        car1.run();
        Car car2 = new Car();
        car2.run();
        Car car3 = new Car();
        car3.run();


        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
        //자동차가 달립니다.
    }
}

class Car{
    public void run(){
        System.out.println("자동차가 달립니다");
    }


}
