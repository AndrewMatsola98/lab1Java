//5) Визначити мінімальний елемент масиву та його індекс (але нехай у масиві буде кілька однакових мінімальних елементів).
public class test45 {
    public static void main(String[] args) {
        int[] myarr = {3, 5, 8,-8, 0, 3, 6, -8, -7, 1, 2,-7}; //тут спочатку  буде шукати індекс і мінамальний елемент по порядку
        int minimum =myarr[0], minIndex = 0;
        for (int i=0;i<myarr.length;i++) {
            if (minimum > myarr[i]){
                minimum = myarr[i];
                minIndex = i;
            }
        }
        System.out.println("мінімальний елемент: " + minimum);
        System.out.println("індекс: " + minIndex);
    }
}
