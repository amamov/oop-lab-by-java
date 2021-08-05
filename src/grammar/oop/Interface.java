package grammar.oop;

// * 인터페이스는 클래스에서 구현해야 하는 작업 명세서이다.
// 인터페이스를 사용하는 가장 큰 이유는 객체가 다양한 자료형(타입)을 가질 수 있기 때문이다.

interface ICalculator {

    public double add(double num1, double num2);

    public double minus(double num1, double num2);

}

interface IRobot {

    public static int population = 0;
    public String name = "";

    public void sayHello();

}

class SpecialRobot implements ICalculator, IRobot {

    public static int population = 0;
    public String name = "";

    public SpecialRobot(String name) {
        this.name = name;
        population++;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }

}

public class Interface {
    public static void main(String[] args) throws Exception {
        SpecialRobot siri = new SpecialRobot("siri");
        siri.sayHello();
    }

    public static <T> void print(T args) {
        System.out.println(args);
    }
}
