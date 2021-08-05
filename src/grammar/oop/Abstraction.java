
package grammar.oop;

// 추상 클래스
abstract class AbsRobot {

    public static int population = 0;
    public String name = "";

    public double add(double num1, double num2) {
        return num1 + num2;
    }

    public double minus(double num1, double num2) {
        return num1 - num2;
    }

    public void sayHello() {
        System.out.println("Hello World!");
    }

    // 추상 메서드 : 상속 받은 클래스는 반드시 구현해야 한다.
    public abstract void myNameIs();

}

class SiriRobot extends AbsRobot {
    SiriRobot(String name) {

        this.name = name;
    }

    public void myNameIs() {
        System.out.println("My name is " + this.name);
    }
}

public class Abstraction {
    public static void main(String[] args) throws Exception {
        SiriRobot siri = new SiriRobot("siri");
        siri.sayHello();
        siri.myNameIs();
    }

}
