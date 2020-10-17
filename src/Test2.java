//2 Вивести на екран двовимірну матрицю
public class Test2 {
    public static void main(String[] args) {
        int ai = 3;
        int bj = 3;
        int[][] array = new int [][]{

                {1,2,3},
                {4,5,6},
                {7,8,9},
                };

        for (int i = 0; i < ai; i++) {
            for (int j = 0; j <bj; j++) {
                System.out.print(array[i][j]);

            }
            System.out.println();
        }
    }
}