import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class MoneyChange {
    public static void main(String[] args) {
        double tyGiaVND = 23000;
        double USD, VND;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Chuyển dổi tiền tệ từ USD sang VND");
        System.out.println("Nhập vào số tiền [USD]: ");
        USD = scanner.nextDouble();
        VND = USD * tyGiaVND;
        System.out.println("Quy đổi ra tiền VND là: " + VND + "VND");
    }
}
