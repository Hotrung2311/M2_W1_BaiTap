import java.util.Scanner;

public class PrintPrimes {
    public static void main(String[] args) {
            int sum = 0;
            int i = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Các số nguyên tố nhỏ hơn 100 là");
            int amount = 100;
            while (i < amount){
                if(isPrime(i)) {
                    sum++;
                    System.out.println("[" + sum + "]: " + i);
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
