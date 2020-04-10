import java.util.Random;
import java.util.Scanner;

public class TestStopWatch {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

// TODO Auto-generated method stub
        final int n = 100000;
        int[] a = new int[n];
        Random rd = new Random();
        //int i, j, min;

        System.out.println("Tạo mảng có 100,000 ngẫu nhiên số và sắp xếp");
        for(int i = 0; i < n; i++) {
            a[i] = rd.nextInt(1000);
        }


        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        for(int i = 0; i < n - 1; i++) {
            for(int j = i + 1; j < n; j++ ) {
                if(a[i] > a[j]) {
                    int min = a[i];
                    a[i] = a[j];
                    a[j] = min;
                }
            }
        }
        stopWatch.stop();

        System.out.println("Thời gian thực hiện thuật toán sắp xếp chọn (selection sort): " + stopWatch.getElapsedTime() +"ms");
    }
}
