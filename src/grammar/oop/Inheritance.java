package grammar.oop;

class Siri extends Robot {

    private String code;

    public Siri(String name, int age, String code) {
        super(name, age);
        this.code = code;
    }

    // 메서드 제정의
    private double minus(double num1, double num2) {
        return num1 - num2;
    }

    // Method Overriding
    @Override
    public double calculator(double num1, double num2) {
        double num3 = super.calculator(num1, num2); // 부모 클래스 메서드 호출
        return minus(num3, num2);
    }

    public void sayCode() {
        System.out.println(getAge() + this.code);
    }
}

// * 모든 클래스는 Object를 상속받는다.

public class Inheritance {
    public static void main(String[] args) throws Exception {
        Siri siri = new Siri("hihi", 24, "8asd12askldjklas1246asdas348t128s4");
        siri.sayHello(); // Hello master, my name is hihi
        print(siri.calculator(12.0, 4.3)); // 12.0
        siri.sayCode();

        // * 익명 클래스 : 주로 메서드를 재정의 하는 목적으로 사용된다.
        Robot anonymousRobot = new Robot("fifi", 24) {
            @Override
            public double calculator(double num1, double num2) {
                return num1 * num2;
            }
        };
        print(anonymousRobot.name); // fifi
        print(anonymousRobot.calculator(12.0, 4.3)); // 51.599999999999994
    }

    public static <T> void print(T args) {
        System.out.println(args);
    }

}
