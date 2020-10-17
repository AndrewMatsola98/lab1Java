//10) Проінкрементувати додатні та продекрементувати від’ємні елементи масиву.
public class test10 {
    public static void main(String[] args) {
        int[] myarr = {34, 56, 88, 46, 89, 39, -54, -81, 32, 20};
        int[] arrN = new  int[myarr.length];

        for(int i=0;i<myarr.length;i++){
            arrN[i]=myarr[i];
            if (arrN[i]>=0)
                ++arrN[i];
            if (arrN[i]<0)
                --arrN[i];
        }
        System.out.print("arr++, arr-- ");
        for (int temp:arrN)
            System.out.print(temp + " ");
    }
}
