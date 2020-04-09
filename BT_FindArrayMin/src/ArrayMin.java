import java.util.Scanner;

public class ArrayMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sô phần tử của mảng là: ");
        int size = scanner.nextInt();

        int[] a = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử [" + i + "]: ");
            a[i] = scanner.nextInt();
        }
        int min = a[0];
        for (int i = 1; i<a.length;i++){
            if (a[i]<min){
                min = a[i];
            }
        }
        System.out.println("Min của mảng là: " + min);
    }
}
