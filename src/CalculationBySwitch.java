public class CalculationBySwitch {
public static void main(String[] args) {
    double a = 100;
    double b = 520;
    double result;
    String operation = "mod";
    switch (operation) {
        case "add": result = a + b;
            System.out.println("Addition result = " + result);
            break;
        case "sub": result = a - b;
            System.out.println("Subtraction result = " + result);
            break;
        case "mult": result = a * b;
            System.out.println("Multiplication result = " + result);
            break;
        case "div": result = a / b;
            System.out.println("Division result = " + result);
            break;
        case "mod": result = a % b;
            System.out.println("Mod result = " + result);
            break;
        default:
            System.out.println("Operation is not valid");

    }

}
}
