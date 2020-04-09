import java.util.Scanner;

public class ColSum {
    public static void main(String[] args) {
        int[][] a = {{-3,1,3,4,5},
                     {6,1,8,9,10},
                     {100,1,4,5,1},
                     {54,1,2,1,5},
                     {5,100,3,-45,1}};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập vào cột muốn tính tổng: ");
        int col = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < a.length; i++){
            //for (int j = 0; j < a[0].length; j++){
                sum += a[i][col];
            //}
        }
        System.out.println("Kết quả :" + sum);
    }
}
