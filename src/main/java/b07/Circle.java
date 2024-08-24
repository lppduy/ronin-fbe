package b07;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void printResults() {
        System.out.println("Bán kính của hình tròn: " + radius);
        System.out.println("Chu vi của hình tròn: " + getCircumference());
        System.out.println("Diện tích của hình tròn: " + getArea());
    }

    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.printResults();
    }
}

