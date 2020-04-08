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
                    System.out.println("Draw the triangle");
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

                    break;
                case 3:
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
