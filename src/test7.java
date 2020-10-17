//6. Порахувати кількість та суму парних елементів масиву

public class test7 {

    public static void main(String[] args) {
        int[] arr = {1, 2, -3, -4, 5, 6, 8, -12, 35, -6, 0};

        int sum = 0;
        int numerosity = 0;

        for (int i : arr) {
            if (i < 0) {
                numerosity++;
            }
            if ((i % 2 == 0)) {
                sum += i;

            }
        }
        System.out.println("к-сть парних елементів " + numerosity);
        System.out.println("сума парних відємних елементів масиву " + sum);
    }
}

