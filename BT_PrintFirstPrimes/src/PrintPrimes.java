import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
        int sum = 0;
        int i = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Số lượng các số nguyên tố đầu tiên muốn in ra:");
        int amount = scanner.nextInt();
        while (sum < amount){
            if(isPrime(i)) {
                sum++;
                System.out.println("Số nguyên tố thứ " + sum + ": " + i);
            }
            i++;
        }
    }

    public static Boolean isPrime(int num){
        boolean check = true;
        if (num < 2){
            check = false;
        }
            int i = 2;
            for (i = 2; i < num-1; i++){
                if (num == 2){
                    check = true;
                }else if (num % i == 0){
                    check = false;
                }
            }

        return check;
    }
}
