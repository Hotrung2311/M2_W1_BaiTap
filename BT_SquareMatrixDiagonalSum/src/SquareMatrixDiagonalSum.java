import java.util.Arrays;
import java.util.Scanner;

public class SquareMatrixDiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào một ma trận 2 vuông");
        System.out.println("Kích thước ma trận: ");
        int size = scanner.nextInt();
        int[][] a = new int[size][size];
        int sum = 0;
        for (int i = 0; i<size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("Phần tử [" + i + "][" + j +"]: ");
                a[i][j] = scanner.nextInt();
                if (i == j){
                    sum += a[i][j];
                }
            }
        }
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));
        System.out.println("Tổng các phần tử nằm trên đường chéo chính: " + sum);
    }
}
