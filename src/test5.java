// 4)  Порахувати суму елементів деякого цілочисельного масиву.
public class test5 {

    public static void main(String[] args) {

        int [] myArr={1,-5,2,3, 12, 4, 0};
        int summa=0;

        for (int x = 0; x < myArr.length; x++)
        {
            summa += myArr[x];
        }
        System.out.println("сума елементів цілочисельного масиву дорівнює " + summa);
    }
}