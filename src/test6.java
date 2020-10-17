//7) Порахувати кількість та суму парних елементів масиву, що знаходяться в діапазоні 40…100
public class test6 {
    public static void main(String[] args) {
        int a=0, b=0;
        int[] array = {34,56,88, 46, 89,39,-54,-81,32,20};
        for(int temp:array) {
            if (temp % 2 == 0) {
                if (temp >= 40 && temp <= 100) {
                    a++;
                    b += temp;
                }
            }
        }
            System.out.println("К-cть парних елементів з 40..100: " + a + "\nїх сума: " + b);
        }
}