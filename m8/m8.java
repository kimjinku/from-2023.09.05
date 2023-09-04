package m8;

public class m8 {
    public static void main(String[] args) {
        System.out.println(Person.avgAge);
        Person p1 = new Person();

        System.out.println(p1.age);
        p1.hi();
    }

        //class에 저장되는 변수 = 클래스 변수 (프로그램이 실행되서 종료될 때 까지 ) 모든 인스턴스가 공유
        //인스턴스에 저장되는 변수( non static 변수)= 인스턴수 변수(인스턴스 생성시부터 인스턴스 소멸 시까지)
        // 모든 함수(메서드)가 공유.
        //함수에 저장되는 변수= 지역변수(메서드 실행시부터 종료시까지) 함수가 단독으로 상용하는 변수(다른 함수 사용x)


}
class Person{
    static int avgAge =100; //클래스 변수
    int age = 30; //인스턴스 변수
    public void hi(){
        System.out.println("안녕");
    }
}
