// 문제 : 자동차 객체를 담을 변수를 만들어주세요.
// 자동차 객체를 변수에 담고 그 변수를 이용해 최고속력이 서로 다르게 만들어주세요.
// 각 자동차가 자신의 최고속력으로 달리게 해주세요.


public class m2 {
    public static void main(String[] args) {

        Vehicle vehicle1 = new Vehicle();
        vehicle1.speed =220;
        vehicle1.runs();
        Vehicle vehicle2 = new Vehicle();
        vehicle2.speed =250;
        vehicle2.runs();


        // 출력 : 자동차가 최대속력 220km로 달립니다.
        // 출력 : 자동차가 최대속력 250km로 달립니다.
    }
}
class Vehicle{
    int speed;

    public void runs(){
        System.out.printf("자동차가 최대속력 %dkm로 달립니다.\n",speed);
    }



}
