//8) Визначити максимальний з парних та мінімальний з непарних елементів масиву.
public class test81 {
    public static void main(String[] args) {
        int[] arr = {34, 56, 88, 46, 89, 39, -54, -81, 32, 20};
        int min = arr[0], max = arr[0];

        for (int temp : arr) {
            if (temp % 2 == 0) {
                if (max < temp) {
                    max = temp;
                }
            }
            if (temp % 2 != 0) {
                if (min > temp) {
                    min = temp;
                }
            }
        }
        System.out.println("Mаксимальний з парних : " + max + ", \nмінімальний з непарних: " + min);
    }
}
