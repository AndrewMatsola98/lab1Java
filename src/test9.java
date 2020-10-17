//9) Змінити знак від’ємних елементів масиву.
public class test9 {
    public static void main(String[] args) {
        int[] arr = {-34, -56, -88, -46, -89, -39, -54, -81, -32, -20};
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i];
            if (arr[i]<0) arr[i]*=-1;
        }
        for (int temp:arr)
            System.out.print(temp + " ");
    }
}
