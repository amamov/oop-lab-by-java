package grammar.basic;

public class HowVariable {

    public static <T> void print(T args) {
        System.out.println(args);
    }

    public static void main(String[] args) throws Exception {
        // * 기본 자료형은 데이터가 변수에 직접 저장되고, 객체 자료형은 객체 메모리 주소가 변수에 저장된다.
        boolean boolValue = true; // 1byte : 기본 자료형
        char charValue = 65; // 2byte : 기본 자료형
        int intValue = 791238; // 4byte : 기본 자료형
        double doubleValue = 23.123789; // 8byte : 기본 자료형
        String helloWorld = "hello world"; // 객체 자료형
        print(boolValue); // true
        print(charValue); // A
        print(intValue); // 791238
        print(doubleValue); // doubleValue
        print(helloWorld); // hello world

        // * 묵시적 형 변환 : 작은 공간의 메모리에서 큰 공간의 메모리로 이동
        int charToIntValue = charValue;
        print(charToIntValue); // 65

        // * 명시적 형 변환 : 큰 공간의 메모리에서 작은 공간의 메모리로 이동, 데이터가 누실될 수 있다.
        int intValue65 = 65;
        char intToCharValue = (char) intValue65;
        print(intToCharValue); // A

        // * f-string
        System.out.printf("10진수 : %d\n", 10); // 10, %d : 10진수
        System.out.printf("8진수 : %o\n", 10); // 12, %o : 8진수
        System.out.printf("16진수 : %x\n", 10); // a, %x : 16진수
        System.out.printf("실수 : %f\n", 10.3); // 10.300000, %f : 실수
        System.out.printf("문자열 : %s\n", "Hello World"); // Hello World, %s : 문자열
        System.out.printf("%d x %d = %d\n", 3, 4, 12); // 3 x 4 = 12
    }

}
