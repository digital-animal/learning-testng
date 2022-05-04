package com.zahid;

public class Main {
    public static void main(String[] args) {
        System.out.printf("\n# TestNG Annotations Examples\n\n");

        System.out.println("# CALCULATOR");
        Calculator calculator = new Calculator();
        double a = 144, b = 36;
        int x = 2, n = 16;
        System.out.printf("# %.2f + %.2f = %.2f\n", a, b, calculator.add(a, b));
        System.out.printf("# %.2f - %.2f = %.2f\n", a, b, calculator.sub(a, b));
        System.out.printf("# %.2f * %.2f = %.2f\n", a, b, calculator.mul(a, b));
        System.out.printf("# %.2f / %.2f = %.2f\n", a, b, calculator.div(a, b));
        System.out.printf("# %.2f %% %.2f = %.2f\n", a, b, calculator.mod(a, b));
        System.out.printf("# %d ^ %d = %.0f\n", x, n, calculator.pow(x, n));
        
        System.out.println();
        System.out.println("# RECTANGLE");
        double length = 36, breadth = 24;
        Rectangle rectangle = new Rectangle(length, breadth);
        System.out.println(rectangle);
        System.out.printf("# Area = %.2f\n", rectangle.area());
        System.out.printf("# Perimeter = %.2f\n", rectangle.perimeter());
        System.out.printf("# isSquare = %b\n", rectangle.isSquare());
        System.out.println();
    }
}
