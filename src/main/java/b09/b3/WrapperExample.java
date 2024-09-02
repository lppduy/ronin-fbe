package b09.b3;

public class WrapperExample {
    public static void main(String[] args) {
        // Integer Wrapper
        Integer intWrapper = Integer.valueOf(42);  // Boxing
        int intValue = intWrapper.intValue();  // Unboxing
        System.out.println("Integer value: " + intValue);

        // Double Wrapper
        Double doubleWrapper = Double.valueOf(3.14);
        double doubleValue = doubleWrapper.doubleValue();
        System.out.println("Double value: " + doubleValue);

        // Boolean Wrapper
        Boolean booleanWrapper = Boolean.valueOf(true);
        boolean booleanValue = booleanWrapper.booleanValue();
        System.out.println("Boolean value: " + booleanValue);

        // Parsing from String
        int parsedInt = Integer.parseInt("123");
        System.out.println("Parsed Integer: " + parsedInt);

        // Converting to String
        String intToString = intWrapper.toString();
        System.out.println("Integer as String: " + intToString);
    }
}
