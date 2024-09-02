package b09.b3;

import java.math.BigInteger;

public class BigIntegerExample {
    public static void main(String[] args) {
        // Creating BigInteger
        BigInteger bigInt1 = new BigInteger("123456789012345678901234567890");
        BigInteger bigInt2 = new BigInteger("987654321098765432109876543210");

        // Addition
        BigInteger sum = bigInt1.add(bigInt2);
        System.out.println("Sum: " + sum);

        // Subtraction
        BigInteger difference = bigInt1.subtract(bigInt2);
        System.out.println("Difference: " + difference);

        // Multiplication
        BigInteger product = bigInt1.multiply(bigInt2);
        System.out.println("Product: " + product);

        // Division
        BigInteger quotient = bigInt2.divide(bigInt1);
        System.out.println("Quotient: " + quotient);

        // Modulus
        BigInteger modulus = bigInt2.mod(bigInt1);
        System.out.println("Modulus: " + modulus);

        // Power
        BigInteger power = bigInt1.pow(2);
        System.out.println("Power: " + power);
    }
}
