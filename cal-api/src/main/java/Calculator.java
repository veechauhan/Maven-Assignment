public class Calculator {
    /**
     *
     */
    protected Calculator() {
    }

    /**
     * @param integer1
     * @param integer2
     */
    public static void multiplication(final double integer1, final double integer2) {
        double multiply = integer1 * integer2;
        System.out.println("Multiplication is: " + multiply);
    }

    /**
     * @param integer1
     * @param integer2
     */
    public static void division(final double integer1, final double integer2) {
        if (integer2 > 0) {
            double integer3 = integer1 / integer2;
            System.out.println("Division is: " + integer3);
        } else {
            System.out.println(0);
        }
    }

    /**
     * @param integer1
     * @param integer2
     */
    public static void addition(final double integer1, final double integer2) {
        double integer3 = integer1 + integer2;
        System.out.println("Sum is: " + integer3);
    }

    /**
     * @param integer1
     * @param integer2
     */
    public static void substraction(final double integer1, final double integer2) {
        double integer3 = integer1 - integer2;
        System.out.println("Substraction is: " + integer3);
    }

}
