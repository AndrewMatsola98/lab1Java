//11) Визначити середнє арифметичне елементів масиву та кількість елементів, що є більшими за середнє арифметичне.
public class test11 {
    public static void main(String[] args) {
        int[] myarr = {34, 56, 88, 46, 89, 39, -54, -81, 32, 20};
        double average =0;
        int number=0;
        for (int temp:myarr)
            average+=temp;
        average/=myarr.length;
        for (int temp:myarr)
            if (temp>average)
                number++;
        System.out.println("Cереднє арифметичне: " + average + ", > за середнє арифметичне: " + number);
    }
}
