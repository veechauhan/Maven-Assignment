import java.util.Scanner;

public final class Application {
    private Application() {

    }

    /**
     * @param args
     */
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(final String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two number");
        int input1 = sc.nextInt();
        int input2 = sc.nextInt();
        Calculator cal = new Calculator();
        cal.multiplication(input1, input2);
        cal.division(input1, input2);
        cal.addition(input1, input2);
        cal.substraction(input1, input2);

    }
}
