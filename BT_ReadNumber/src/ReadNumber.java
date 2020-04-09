import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập vào số cần đọc: ");
        int number = scanner.nextInt();
        String nums = Integer.toString(number);
        String[] num = nums.split("");
        //int[] num = nums.tostring().split()
        if (number < 10){
            System.out.println("Result: " + readOneNumber(num[0]));
        }else if (number < 100){
            String printText = "";
            switch (num[0]){
                case "1":
                    switch (number){
                        case 10:
                            printText = "ten";
                            break;
                        case 11:
                            printText = "eleven";
                            break;
                        case 12:
                            printText = "twelve";
                            break;
                        case 13:
                            printText = "thirteen";
                            break;
                        case 15:
                            printText = "fifteen";
                            break;
                        case 18:
                            printText = "eighteen";
                            break;
                        default:
                            printText = readOneNumber(num[0]) + "teen";
                    }
                    break;
                case "2":
                    printText = "Twenty " + readOneNumber(num[1]);
                            break;
                case "3":
                    printText = "Thirty " + readOneNumber(num[1]);
                    break;
                case "5":
                    printText = "Fifty " + readOneNumber(num[1]);
                    break;
                default:
                    printText = readOneNumber(num[0]) + "ty" + " " + readOneNumber(num[1]);
            }
            System.out.println(printText);
        }
        if (number >= 100){
            String printText = "";
            switch (num[1]){
                case "0":
                    switch (num[2]){
                        case "0":
                            printText = readOneNumber(num[0]) + " hundred";
                            break;
                        default:
                            printText = readOneNumber(num[0]) + " hundred and " + readOneNumber(num[2]) + "a";
                            break;
                    }
                    break;
                case "1":
                    switch (number){
                        case 10:
                            printText = readOneNumber(num[0]) + " hundred and " + "ten";
                            break;
                        case 11:
                            printText = readOneNumber(num[0]) + " hundred and " + "eleven";
                            break;
                        case 12:
                            printText = readOneNumber(num[0]) + " hundred and " + "twelve";
                            break;
                        case 13:
                            printText = readOneNumber(num[0]) + " hundred and " + "thirteen";
                            break;
                        case 15:
                            printText = readOneNumber(num[0]) + " hundred and " + "fifteen";
                            break;
                        case 18:
                            printText = readOneNumber(num[0]) + " hundred and " + "eighteen";
                            break;
                        default:
                            printText = readOneNumber(num[0]) + " hundred and " + readOneNumber(num[1]) + "teen";
                            break;
                    }
                    break;
                case "2":
                    printText = readOneNumber(num[0]) + " hundred and twenty " + readOneNumber(num[2]);
                    break;
                case "3":
                    printText = readOneNumber(num[0]) + " hundred and thirty " + readOneNumber(num[2]);
                    break;
                case "5":
                    printText = readOneNumber(num[0]) + " hundred and fifty " + readOneNumber(num[2]);
                    break;
                case "8":
                    printText = readOneNumber(num[0]) + " hundred and eighty " + readOneNumber(num[2]);
                    break;
                default:
                    printText = readOneNumber(num[0]) + " hundred and " + readOneNumber(num[1]) + "ty" + " " + readOneNumber(num[2]);
                    break;
            }
            System.out.println(printText);
        }
    }

    public static String readOneNumber(String a){
        String result = "";
        switch (a){
            case "0":
                result = "zero";
                break;
            case "1":
                 result = "one";
                 break;
            case "2":
                 result = "two";
                 break;
            case "3":
                 result = "three";
                 break;
            case "4":
                 result = "four";
                 break;
            case "5":
                 result = "five";
                 break;
            case "6":
                 result = "six";
                 break;
            case "7":
                 result = "seven";
                 break;
            case "8":
                 result = "eight";
                 break;
            case "9":
                result = "nine";
                break;
        }

        return result;
    }
}
