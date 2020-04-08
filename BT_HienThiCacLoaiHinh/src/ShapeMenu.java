import java.util.Scanner;

public class ShapeMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 1;
        System.out.println("Menu");
        System.out.println("1. Print the rectangle");
        System.out.println("2. Print the square triangle");
        System.out.println("3. Print isosceles triangle");
        System.out.println("4. Exit");
        System.out.println("Enter your choice:");
        while(choice != 4) {
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Print the rectangle");
                    System.out.print("Width: ");
                    int width = scanner.nextInt();
                    System.out.print("Height: ");
                    int height = scanner.nextInt();

                    for (int i = 0; i < height; i++){
                        System.out.println("");
                        for (int j = 0; j < width; j++){
                            System.out.print("* ");
                        }
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    System.out.print("Width: ");
                    width = scanner.nextInt();
                    System.out.print("Height: ");
                    height = scanner.nextInt();

                    System.out.println("1. top-left");
                    System.out.println("2. bottom-left");
                    //System.out.println("3. top-right");
                    //System.out.println("4. bottom-right");
                    System.out.println("Enter your choice:");

                    int choice1 = 1;
                    choice1 = scanner.nextInt();

                    switch (choice1){
                        case 1:
                            for (int i = 0; i < height; i++){
                                System.out.println("");
                                for (int j = i; j < width; j++){
                                    System.out.print("* ");
                                }
                            }
                            break;
                        case 2:
                            for (int i = 0; i < height; i++){
                                System.out.println("");
                                for (int j = 0; j < i+1 ; j++){
                                    System.out.print("* ");
                                }
                            }
                            break;
//                        case 3:
//                            for (int i = 0; i < height; i++){
//                                System.out.println("");
//                                for (int j = width-1; j >= i ; j--){
//                                    System.out.print(" *");
//                                }
//                            }
//                            break;
                    }
                    break;
                case 3:
                    System.out.println("Print the isosceles triangle");
                    System.out.print("Width: ");
                    width = scanner.nextInt();
                    System.out.print("Height: ");
                    height = scanner.nextInt();
                    for (int i = 0; i < height; i++){
                        System.out.println("");
                        for (int j = 0; j < i+1 ; j++){
                            System.out.print("* ");
                        }
                    }
                    for (int i = 1; i < height; i++){
                        System.out.println("");
                        for (int j = i; j < width; j++){
                            System.out.print("* ");
                        }
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
