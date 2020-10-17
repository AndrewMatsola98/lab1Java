//1 завдання
public class Test {
    public static void main(String[] args) {
        System.out.println("числа які діляться на 7 ");
        for (int i = 1; i <= 500; i++) {
            if (i % 7 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("числа які діляться на 11 ");
        for (int i = 1; i <= 500; i++) {
            if (i % 11 == 0)
                System.out.println(i);
        }
    }
}
