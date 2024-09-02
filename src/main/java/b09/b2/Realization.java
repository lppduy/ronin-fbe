package b09.b2;

interface Payment {
    void process(double amount);  // Interface defining a contract
}

class CreditCardPayment implements Payment {  // Realization: CreditCardPayment "realizes" Payment
    @Override
    public void process(double amount) {
        System.out.println("Processing credit card payment of $" + amount);
    }
}

public class Realization {
    public static void main(String[] args) {
        Payment payment = new CreditCardPayment();
        payment.process(150.0);  // Output: Processing credit card payment of $150.0
    }
}

