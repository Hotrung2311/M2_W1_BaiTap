import java.util.Arrays;

public class Test {
    public static void main(String[] args) {


        //static void method1(float a){  }

        //static void method1(int c){  }

        //static void method1(double d){  }
        int a = 100;
        m(a);
        System.out.println(a);
    }


    static void m(int x) {
        x = 200;
    }
}
