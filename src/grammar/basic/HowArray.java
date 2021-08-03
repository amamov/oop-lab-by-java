package grammar.basic;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class HowArray {

    public static void main(String[] args) throws Exception {
        // * 배열 선언 후 초기화
        int[] myArray = new int[5];
        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[4] = 300;
        print(myArray); // [I@626b2d4a
        print(myArray[1]); // 200
        print(myArray[3]); // 0

        // * 배열 선언과 동시에 초기화
        int[] myArrayWithSync = { 10, 20, 30, 40, 50 };
        print(myArrayWithSync[3]); // 40
        print(myArrayWithSync[4]); // 50

        // * 배열의 길이
        print(myArray.length); // 5

        // * 배열 요소 출력
        print(Arrays.toString(myArray)); // [100, 200, 300, 0, 300]

        // * 배열 요소 복사
        print(myArray); // [I@626b2d4a
        int[] copiedMyArray = Arrays.copyOf(myArray, myArray.length);
        print(copiedMyArray); // [I@5e265ba4
        print(Arrays.toString(copiedMyArray)); // [100, 200, 300, 0, 300]
        copiedMyArray[0] = 999;
        print(Arrays.toString(copiedMyArray)); // [999, 200, 300, 0, 300]
        print(Arrays.toString(myArray)); // [100, 200, 300, 0, 300]

        // * 배열 레퍼런스 : 주소가 같다.
        print(myArray); // [I@626b2d4a
        int[] refMyArray = myArray;
        print(refMyArray); // [I@626b2d4a
        print(Arrays.toString(refMyArray)); // [100, 200, 300, 0, 300]
        refMyArray[0] = 999;
        print(Arrays.toString(refMyArray)); // [999, 200, 300, 0, 300]
        print(Arrays.toString(myArray)); // [999, 200, 300, 0, 300]

        // * 다차원 배열
        int[][] multiArray = new int[3][2];
        multiArray[0][0] = 10;
        multiArray[0][1] = 20;
        multiArray[2][1] = 30;

        // * for, while
        forWhileStudy();

        // * 배열 순회
        for (int item : myArray) {
            print(item);
        }

        // * 리스트
        List<String> fruits = Arrays.asList("Apple", "Banana", "Coconut", "Lemon", "Melon");

        // * 리스트 순회 - 1
        for (int i = 0; i < fruits.size(); i++) {
            print(fruits.get(i));
        }

        // * 리스트 순회 - 2
        for (Iterator<String> iter = fruits.iterator(); iter.hasNext();) {
            print(iter.next());
        }

        // * 리스트 순회 - 3
        for (String fruit : fruits) {
            print(fruit);
        }

        // * 리스트 순회 - 4
        fruits.stream().forEach(System.out::println);

    }

    public static <T> void print(T args) {
        System.out.println(args);
    }

    public static void forWhileStudy() {
        int startNumber = 7;
        for (int i = 1; i < 10; i++) {
            System.out.printf("%d x %d = %d\n", startNumber, i, startNumber * i);
        }
        startNumber = 8;
        int j = 1;
        while (j < 10) {
            System.out.printf("%d x %d = %d\n", startNumber, j, startNumber * j);
            j++;
        }
    }

}
