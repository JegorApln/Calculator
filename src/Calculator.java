import java.util.*;

public class Calculator {
static Scanner InputScan = new Scanner(System.in);
    public static void main(String[] args) {
            double a, b;
            char c=0;
            double r;
            try {
                System.out.println("Calculator program\n");
                System.out.println("input first operand\n");
                a=InputScan.nextDouble();
                System.out.println("input second operand\n");
                b=InputScan.nextDouble();
                System.out.println("input operation\n");
                c=InputScan.next().charAt(0);
            }
            catch (InputMismatchException ime ) {
                System.out.println("invalid parameter format");
                return;
            }
            if (c!='+' & c!='-' & c!='*' & c!='/'){
                System.out.println("unsupported operation");
                return;
            }
        }
}
