import java.util.Scanner;

public class Solve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Phương trình bậc 2: ax^2 + bx + c = 0");
        System.out.print("Nhập vào a = ");
        double a = sc.nextDouble();
        System.out.print("Nhập vào b = ");
        double b = sc.nextDouble();
        System.out.print("Nhập vào c = ");
        double c = sc.nextDouble();
        QuadraticEquation bt = new QuadraticEquation(a,b,c);
        System.out.println("Kết quả:");
        if (bt.getDiscriminant() > 0){
            System.out.println("x1 = " + bt.getRoot1());
            System.out.println("x2 = " + bt.getRoot2());
        }else if (bt.getDiscriminant() == 0){
            System.out.println("x = " + bt.getRoot1());
        }else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
