public class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double get_a(){
        return a;
    }
    double get_b(){
        return b;
    }
    double get_c(){
        return c;
    }
    double getDiscriminant(){
        double delta = Math.pow(this.b,2) - 4* this.a*this.c;
        return delta;
    }
    double getRoot1(){
        double root1 = (-this.b + Math.pow(this.getDiscriminant(), 0.5))/(2*this.a);
        return root1;
    }
    double getRoot2(){
        double root2 = (-this.b + Math.pow(this.getDiscriminant(), 0.5))/(2*this.a);
        return root2;
    }
}
