public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation() {
    }

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    private double getDiscriminant() {
        return Math.pow(b, 2) - 4 * a * c;
    }

    private double getRoot1() {
        return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
    }

    private double getRoot2() {
        return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
    }

    private boolean isDeltaEqual0() {
        return (getDiscriminant() == 0);
    }

    private boolean isDeltaLess0() {
        return (getDiscriminant() < 0);
    }
    public void calculateResult(){
        if (isDeltaLess0()){
            System.out.println("The equation has no roots");
        } else if (isDeltaEqual0()) {
            System.out.println("Root 1 = root 2 = " + getRoot1());
        } else {
            System.out.println("Root 1 = " + getRoot1());
            System.out.println("Root 2 = " + getRoot2());
        }
    }
}
