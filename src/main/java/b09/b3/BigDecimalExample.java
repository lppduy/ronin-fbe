package b09.b3;

import java.math.BigDecimal;

public class BigDecimalExample {
    public static void main(String[] args) {
        // Creating BigDecimal
        BigDecimal bd1 = new BigDecimal("12345.6789");
        BigDecimal bd2 = new BigDecimal("9876.54321");

        // Addition
        BigDecimal sum = bd1.add(bd2);
        System.out.println("Sum: " + sum);

        // Subtraction
        BigDecimal difference = bd1.subtract(bd2);
        System.out.println("Difference: " + difference);

        // Multiplication
        BigDecimal product = bd1.multiply(bd2);
        System.out.println("Product: " + product);

        // Division with scale and rounding mode
        BigDecimal quotient = bd1.divide(bd2, 4, BigDecimal.ROUND_HALF_UP);
        System.out.println("Quotient: " + quotient);

        // Setting Scale
        BigDecimal scaledValue = bd1.setScale(2, BigDecimal.ROUND_HALF_UP);
        System.out.println("Scaled Value: " + scaledValue);
    }
}

