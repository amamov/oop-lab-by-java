package grammar.oop;

class Robot {

    // 속성 정의
    public static int population; // static 변수 (클래스 변수)
    public String name; // 인스턴스 변수
    private int age; // 인스턴스 변수

    // 생성자
    public Robot(String name, int age) {
        this.name = name;
        this.age = age;
        population++;
    }

    // private 메서드
    private double add(double num1, double num2) {
        return num1 + num2;
    }

    // public static 메서드 (public 클래스 메서드)
    public static int howMany() {
        return population;
    }

    // public 메서드
    public double calculator(double num1, double num2) {
        return add(num1, num2);
    }

    // public 메서드
    public void sayHello() {
        System.out.println("Hello master, my name is " + this.name);
    }

    // age Getter
    public int getAge() {
        return this.age;
    }

    // age Setter
    public void setAge(int newAge) {
        if (newAge > 0)
            this.age = newAge;
        else
            System.out.println("Error: invalid age");
    }

    // 소멸자 : 객체가 GC에 의해서 메모리에서 제거 될 때 finalize() 메서드가 호출된다.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("This is finalize method! from " + this.name);
        super.finalize();
    }
}

// * 객체는 메모리에서 동적으로 생성되며, 객체가 더 이상 필요 없게 되면 GC(Garbage Collector)에 의해서 제거된다.
// 생성한 객체의 주소를 변수에 저장하는 것을 레퍼런스라고 한다. 레퍼런스에는 객체의 주소가 저장되어 있다.
// 레퍼런스에 null이 저장되면 객체의 연결이 끊기며, 더 이상 객체를 이용할 수 없다.

public class Encapsulation {
    public static void main(String[] args) throws Exception {
        Robot siri = new Robot("siri", 24); // * siri는 객체의 주소를 담고 있는 레퍼런스이다. 실제 객체는 별도로 메모리 공간 어딘가에 저장되어 있다.
        siri.sayHello();
        print(siri.calculator(19.0, 1.0));
        print(Robot.howMany()); // 1
        print(siri.getAge()); // 24
        siri.setAge(-2); // Error: invalid age

        Robot jarvis = new Robot("jarvis", 25);
        jarvis.sayHello();
        print(Robot.howMany()); // 2

        print(siri); // grammar.oop.Robot@53bd815b
        print(jarvis); // grammar.oop.Robot@2401f4c3

        siri = null; // 객체의 레퍼런스에 null이 저장되므로 객체와의 연결이 끊긴다.
        // siri.name; // java.lang.NullPointerException

        System.gc(); // GC가 바로 작동하는 것은 아니고 가급적 빨리 작동하도록 요청하는 것이다. (실제로 이 메서드를 사용하는 경우는 드물다.)
        // This is finalize method! from siri
    }

    public static <T> void print(T args) {
        System.out.println(args);
    }
}
